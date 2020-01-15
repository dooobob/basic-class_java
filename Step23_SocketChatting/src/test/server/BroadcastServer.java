package test.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class BroadcastServer {
	//Socket 접속된 클라이언트를 응대하는 스레드객체의 id를 저장 할 가변 배열객체 생성
	static List<ServerThread> threadList=new ArrayList<ServerThread>();
	
	//실행순서의 시작점이 되는 메인 메소드
	public static void main(String[] args) {
		ServerSocket server=null;
		try{
			server=new ServerSocket(5000);
			//반복문 돌면서 클라이언트 Socket 접속 요청을 대기한다.
			while(true){
				System.out.println("클라이언트의 접속을 기다립니다...");
				//클라이언트가 접속해오면 Socket객체를 반환한다.
				Socket socket=server.accept();
				//접속한 클라이언트의 ip주소
				String ip=socket.getInetAddress().getHostAddress();
				System.out.println(ip+" 에서 접속 했습니다.");
				//스레드객체를 생성해서 접속한 클라이언트를 응대한다.
				ServerThread thread=new ServerThread(socket);
				thread.start();
				//생성된 스레드객체의 id를 배열에 저장한다.
				threadList.add(thread);
				System.out.println("참여자수 : "+threadList.size());
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(server!=null)server.close();
			}catch(Exception e){}
		}
		System.out.println("메인 메소드가 종료됩니다.");
	}
	//스레드 객체를 생성할 클래스 정의하기
	static class ServerThread extends Thread{
		//필요한 멤버필드 정의하기
		private Socket socket;
		BufferedReader br;
		BufferedWriter bw;
		String id;//클라이언트의 아이디를 저장 할 공간
		
		//생성자
		public ServerThread(Socket socket){
			//생성자의 인자로 전달된 Socket객체의 id를 멤버필드에 저장한다.
			this.socket=socket;
		}
		@Override
		public void run() {
			try{
				//필요한 객체의 참조값을 얻어내서 멤버필드에 저장한다.
				br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				boolean isRun=true;
				while(isRun){
					//클라이언트가 전송한 메세지가 있다면 읽어온다.
					String msg=br.readLine();
					if(msg==null){//읽어온 값이 null 이라면
						//접속이 끊겼다고 간주한다.
						threadList.remove(this);
						sendClientList();
						isRun=false;
					}else{
						String[] result=msg.split("#");
						String msgType=result[0];
						if(msgType=="0"){//새로운 참여자 들어왔을때
							//아이디를 멤버필드에 저장한다.
							id=result[1];
							//대화방 참여자 목록을 보내준다.
							sendClientList();
						}else if(msgType=="1"){
							//대화 메세지를 보내준다.
							sendMessage(msg);
						}else if(msgType=="2"){
							sendMessage(msg);
							//나의 스레드 객체를 배열에서 제거한다
							threadList.remove(this);
							//스레드 종료 될 수 있도록
							isRun=false;
							//대화 참여자 목록을 다시 보내준다.
							sendClientList();
						}else if(msgType=="3"){
							sendClientList();
						}
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				
			}
		}//run
		
		//대화방 참여자 목록을 클라이언트에게 보내는 메소드
		public void sendClientList() throws IOException{
			String data="3";
			for(int i=0; i<threadList.size();i++){
				//i번째 ServerThread객체를 얻어온다.
				ServerThread tmp=threadList.get(i);
				if(i==0){
					data+="#"+tmp.id;
				}else{
					data+=","+tmp.id;
				}
			}
			for(ServerThread tmp:threadList){
				tmp.bw.write(data);
				tmp.bw.newLine();
				tmp.bw.flush();			
			}
		}
		
		//클라이언트에게 문자열을 보내는 메소드
		public void sendMessage(String msg) throws IOException{
			for(ServerThread tmp:threadList){
				tmp.bw.write(msg);
				tmp.bw.newLine();
				tmp.bw.flush();
			}
		}
	}//class ServerThread
}
