package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class FrameMain5 extends JFrame implements ActionListener{
	//필요한 맴버필드 정의하기
	JTextField inputNum, inputName, inputAddr;
	DefaultTableModel model;
	//회원정보를 저장할 가변 배열 객체 
	List<MemberDto> list=new ArrayList<MemberDto>();
	JButton saveBtn, deleteBtn, updateBtn;
	JTable table;
	//현재 수정중인지 여부 
	boolean isUpdating=false;
	//현재 수정중인 인덱스 
	int updatingIndex; 
	
	//생성자
	public FrameMain5(){
		//레이아웃 설정 
		setLayout(new BorderLayout());
		//페널 객체 생성하기
		JPanel panel=new JPanel();
		
		//레이블 객체 생성하기 
		JLabel label1=new JLabel("번호");
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("주소");
		
		//텍스트 필드 객체 생성하기
		inputNum=new JTextField(10);
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		
		//버튼객체를 만들고 리스너를 등록한다. 
		saveBtn=new JButton("저장");
		deleteBtn=new JButton("삭제");
		updateBtn=new JButton("수정");
		
		saveBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		
		//페널에 컴포넌트 추가하기
		panel.add(label1);
		panel.add(inputNum);
		panel.add(label2);
		panel.add(inputName);
		panel.add(label3);
		panel.add(inputAddr);
		panel.add(saveBtn);
		panel.add(deleteBtn);
		panel.add(updateBtn);
		
		//테이블의 칼럼명 정하기
		String[] colNames={"번호","이름","주소"};
		//테이블에 연결할 모델 객체 생성하기
		model=new DefaultTableModel(colNames, 0);
		//JTable 객체 생성하면서 생성자의 인자로 DefaultTableModel 객체 전잘하기
		table=new JTable(model);
		
		//스크롤이 가능한 페널 객체로 테이블을 감싼다.
		JScrollPane scPane=new JScrollPane(table);
		
		//페널을 프레임에 추가하기
		add(panel, BorderLayout.NORTH);
		//프레임에 테이블 추가하기
		add(scPane, BorderLayout.CENTER);
		
		//JTable 에 출력하기
		displayMember();
		
		//프레임의 위치, 폭과, 높이 지정
		setBounds(100, 100, 800, 500);
		//눈에 보일수 있도록 한다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new FrameMain5();
	}
	// implements ActionListener 했기 때문에 강제 구현된 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 참조값을 얻어와서 
		Object which=e.getSource();
		//if 문으로 분기한다. 
		if(which == saveBtn){
			//입력한 번호를 정수 형태로 바꿔준다.
			int num=Integer.parseInt(inputNum.getText());
			String name=inputName.getText();
			String addr=inputAddr.getText();
			//입력한 회원정보를 MemberDto 객체에 담는다.
			MemberDto dto=new MemberDto(num, name, addr);
			//가변배열에 저장한다.
			//list.add(dto);
			MemberDao.getInstance().insert(dto);
			//입력창 초기화
			inputNum.setText("");
			inputName.setText("");
			inputAddr.setText("");
			//회원정보를 JTable 에 출력하기 
			displayMember();
			//배열의 내용을 파일에 저장하는 작업을 한다.
			//saveToFile();
		}else if(which == deleteBtn){
			//선택된 table row 인덱스를 읽어온다.
			int selectedIndex=table.getSelectedRow();
			if(selectedIndex == -1){//어떤 row 도 선택되지 않았다면
				JOptionPane.showMessageDialog(this, "삭제할 row 를 선택하셈!");
				return; //메소드 종료
			}
			
			MemberDto dto=list.get(selectedIndex);
			//배열에서 해당 인덱스를 삭제
			MemberDao.getInstance().delete(dto.getNum());
			//다시 출력한다.
			displayMember();
			//파일에도 반영한다.
			//saveToFile();
		}else if(which == updateBtn){
			if(isUpdating){//현재 수정 중인경우 
				//수정할 회원의 정보를 읽어온다.
				MemberDto dto=list.get(updatingIndex);
				dto.setName(inputName.getText());
				dto.setAddr(inputAddr.getText());
				//수정 입력한 정보를 넣어준다.
				MemberDao.getInstance().update(dto,
						Integer.parseInt(inputNum.getText()));
				//입력창 초기화
				inputNum.setText("");
				inputName.setText("");
				inputAddr.setText("");
				isUpdating=false;
				updateBtn.setText("수정");
				displayMember();//수정된 정보가 table 에 표시 되도록 호출한다.
				JOptionPane.showMessageDialog(this, "수정 하였습니다.");
			}else{//수정중이 아닌경우
				int selectedIndex = table.getSelectedRow();
				//수정중인 인덱스를 맴버필드에 저장
				updatingIndex = selectedIndex;
				if(selectedIndex==-1){
					JOptionPane.showMessageDialog(this, "수정할 row 를 선택하셈!");
					return;
				}
				//선택된 row 의 정보를 얻어온다.
				MemberDto dto=list.get(selectedIndex);
				//출력해주기
				inputNum.setText(Integer.toString(dto.getNum()));
				inputName.setText(dto.getName());
				inputAddr.setText(dto.getAddr());
				isUpdating=true;
				updateBtn.setText("수정확인");
			}
		}
	}
	//회원정보를 JTable 에 출력하는 메소드 
	public void displayMember(){
		//MemberDao 객체의 참조값 얻어오기
		MemberDao dao=MemberDao.getInstance();
		//회원목록을 얻어와서 멤버필드에 저장한다.
		list=dao.getList();
		//model 초기화 
		model.setNumRows(0);		
		for( MemberDto tmp :list ){
			//출력할 회원 한명의 정보를 Object[] 객체에 순서대로 담는다.
			Object[] mem={tmp.getNum(), tmp.getName(), tmp.getAddr()};
			//model 객체를 이용해서 JTable 에 출력한다
			model.addRow(mem);
		}
	}
}














