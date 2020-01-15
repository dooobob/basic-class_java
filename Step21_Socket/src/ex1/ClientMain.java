package ex1;
/*
 * [ Socket 클라이언트 프로그램 작성순서 ]
 * 
 * 1. Socket 객체 생성 : 생성됨과 동시에 서버에 소켓 접속을 시도함
 * 		- 접속할 서버의 ip주소와 port번호가 피룡하다
 * 2. Socket 객체를 이용해서 서버와 통신하기
 * 3. 필요한 작업을 완료한 후 Socket 객체 닫아주기
 */
import java.net.Socket;

public class ClientMain {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수 만들기
		Socket socket=null;
		try{
			//연결 요청할 com의 ip주소와 port번호를 생성자의 인자로
			//전달해서 Socket객체를 생성한다.
			//자동으로 연결 요청이 된다.
			socket=new Socket("192.168.0.18",5000);
			System.out.println("Socket 서버에 접속 성공!");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(socket!=null)socket.close();
			}catch(Exception e){}
		}
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
