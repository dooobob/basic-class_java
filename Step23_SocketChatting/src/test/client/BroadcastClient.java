package test.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*
 * [ 문자열 전송 약속 ]
 * 
 * 0#id				 => 새로운 클라이언트 접속 메세지
 * 1#id#message		 => 대화 메세지
 * 2#id				 => 종료메세지
 * 3#id1,id2,id3,... => 대화 참여자 목록 업데이트 메세지
 */

public class BroadcastClient extends JFrame implements ActionListener{
	//접속할 서버의 ip주소와 클라이언트의 아이디(이름)
	private String ip,id;
	private JTextArea jta;//채팅의 내용을 출력할 곳
	private JTextField jtf;//전송할 메세지를 작성할 곳
	private JLabel jlb1, jlb2;//레이블
	private JPanel jp1, jp2, jp3;//패널
	private JButton jbtn;//전송 버튼
	private JList jlist;//접속자 명단을 출력할 곳
	//문자열을 읽어들이거나 출력할 객체
	private BufferedReader br;
	private BufferedWriter bw;
	
	//생성자
	public BroadcastClient(String ip, String id){
		this.ip=ip;
		this.id=id;
		//메세지를 입력할 TextField
		jtf=new JTextField(30);
		//전송버튼
		jbtn=new JButton("전송");
		//패널객체 생성
		jp1=new JPanel();
		//패널 내부에서의 레이아웃 설정
		jp1.setLayout(new BorderLayout());
		jp1.add(jtf, BorderLayout.CENTER);
		jp1.add(jbtn, BorderLayout.EAST);
		
		//프레임의 레이아웃 설정
		setLayout(new BorderLayout());
		add(jp1,BorderLayout.SOUTH);
		
		//접속 정보 출력하기
		jlb1=new JLabel("사용자 id : "+id);
		jlb2=new JLabel("ip : "+ip);
		jp2=new JPanel();
		jp2.setLayout(new BorderLayout());
		jp2.add(jlb1, BorderLayout.WEST);
		jp2.add(jlb2, BorderLayout.EAST);
		
		add(jp2,BorderLayout.NORTH);
		
		//row:10, col:50사이즈의 textArea객체 생성
		jta=new JTextArea("",10,50);
		jta.setBackground(Color.pink);//배경색을 핑크색으로
		//스크롤가능하도록
		JScrollPane jsp=new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,//수직 스크롤바 생기도록
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);//수평 스크롤바 불가
		add(jsp,BorderLayout.CENTER);
		
		//접속자 명단에 관련된 처리
		String[] names={"접속자 명단"};
		jlist=new JList(names);
		jlist.setBackground(Color.yellow);
		jp3=new JPanel();
		jp3.setLayout(new BorderLayout());
		jp3.add(jlist, BorderLayout.CENTER);
		
		add(jp3,BorderLayout.EAST);
		
		//TextArea 수정불가
		jta.setEditable(false);
		
		//프레임의 위치와 크기 지정
		setBounds(450,150,500,500);
		setVisible(true);
		
		jtf.addActionListener(this);
		
		//버튼 리스너 등록하기(전송버튼)
		jbtn.addActionListener(this);
		//프레임이 닫아지는 이벤트를 감지 할 리스너 등록
		addWindowListener(wAdapter);
		//스레드 객체 생성해서 시작 시키기
		new ClientThread().start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//입력한 문자열을 읽어온다.
		String msg=jtf.getText();
		if(msg.equals(""))return;
		//서버에 보낼 문자열을 구성한다.
		String str="1#"+id+"#"+msg;
		try{
			//BufferedWriter 객체를 이용해서 문자열을 출력한다.
			bw.write(str);
			bw.newLine();//개행기호
			bw.flush();//출력
		}catch(Exception e){
			e.printStackTrace();
		}
		//입력창 초기화
		jtf.setText("");		
	}
	
	//익명의 inner Class를 이용해서 WindowAdapter 클래스를 상속받은 객체를 생성한다.
	WindowAdapter wAdapter=new WindowAdapter() {
		//JFrame이 닫히기 직전에 호출되는 메소드
		public void windowClosing(java.awt.event.WindowEvent event) {
			try{
				//나간다는 종료 메세지를 보낸다.
				bw.write("2#"+id);
				bw.newLine();
				bw.flush();
			}catch(Exception e){
				e.printStackTrace();
			}			
		};
	};
	
	//서버에 도착하는 메세지를 받을 스레드 객체를 생성할 클래스
	class ClientThread extends Thread{
		
		@Override
		public void run() {
			Socket socket=null;
			try{
				//지정된 ip주소의 5000포트에 접속 요청을 한다.
				socket=new Socket(ip,5000);
				//접속이 되었다면 필요한 객체의 참조값을 얻어온다.
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				//채팅방 입장에 관련된 메세지를 서버에 보낸다.
				bw.write("0#"+id);
				bw.newLine();
				bw.flush();
				//반복문 돌면서 지속적으로 서버에서 도착하는 메세지가 있는지 감시한다.
				boolean isRun=true;
				while(isRun){
					//서버에서 보내는 문자열이 있을경우 읽어온다.
					String msg=br.readLine();
					//문자열을 #으로 구분해서 Sring[] Type으로 얻어온다.
					String[] result=msg.split("#");
					//0 or 1 or 2 or 3
					String msgType=result[0];
					if(msgType.equals("0")){//새로운 클라이언트 입장 메세지
						String userID=result[1];//입장한 클라이언트의 아이디
						jta.append(userID+" 님 입장\r\n");
						scrollToBottom();
					}else if(msgType.equals("1")){
						String userID=result[1];
						String str=result[2];//도착된 메세지 내용
						//메세지 내용을 출력한다.
						jta.append(userID+" : "+str+"\r\n");
						scrollToBottom();
					}else if(msgType.equals("2")){
						String userID=result[1];
						if(userID.equals(id)){//내가 종료되는 경우
							//반복문 빠져 나오도록
							isRun=false;
						}else{//남이 종료되는 경우
							jta.append(userID+" 님이 퇴장 했습니다."+"\r\n");
							scrollToBottom();
						}
					}else if(msgType.equals("3")){//대화 참여자 목록 업데이트
						String ids=result[1];
						//참여자 아이디 목록을 얻어온다.
						String[] idList=ids.split(",");
						//참여자 목록을 JList객체에 출력한다.
						jlist.setListData(idList);
					}
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(br!=null)br.close();
					if(bw!=null)bw.close();
					if(socket!=null)socket.close();
				}catch(Exception e){}
			}
			//시스템 종료(프로세스 종료)
			System.exit(0);
		}//run
		
		//최근 추가된 글내용이 보일 수 있도록 하는 메소드
		public void scrollToBottom(){
			//최근에 추가된 글 내용이 보일 수 있도록 스크롤 한다.
			jta.setCaretPosition(jta.getDocument().getLength());			
		}
	}

	public static void main(String[] args) {
		new BroadcastClient("192.168.0.21", "김경태");
	}
}