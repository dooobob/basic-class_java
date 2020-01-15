package ex1;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * [ Socket 서버 프로그램 작성 순서 ]
 * 
 * 1. ServerSocket 객체를 생성한다.(port번호 필요)
 * 2. 클라이언트의 접속을 기다리고 있다가 접속 해오면 이름을 받아들인다.
 * 3. 반환된 Socket 객체는 클라이언트와 통신을 하고 ServerSocket객체는
 * 	   다시 다른 클라이언트의 접속을 기다린다.
 * 4. 클라이언트와 접속을 종료하려면 Socket객체를 닫아준다.
 */
public class ServerMain {
	public static void main(String[] args) {
		//필요한 객체를 저장할 변수를 만들어 놓는다.
		ServerSocket server=null;
		Socket socket=null;
		try{
			//5000번 port를 열고 클라이언트의 접속을 기다린다.
			server=new ServerSocket(5000);
			System.out.println("클라이언트의 접속을 대기중...");
			//접속 요청이 올 때까지 리턴되지 않고 블록킹되는 메소드
			//5000번 port에 접속 요청이 오면 메소드가 리턴되면서
			//클라이언트와 연결된 Socket객체의 id를 반환한다.
			while(true){
				socket=server.accept();
				InetAddress iAddr=socket.getInetAddress();
				//접속된 클라이언트의 ip주소 얻어오기
				String clientIp=iAddr.getHostAddress();
				System.out.println(clientIp+"가 접속했습니다.");				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(server!=null)server.close();
				if(socket!=null)socket.close();
			}catch(Exception e){}
		}
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
