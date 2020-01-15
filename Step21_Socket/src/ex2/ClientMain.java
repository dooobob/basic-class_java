package ex2;

/*
 * [ Socket 클라이언트 프로그램 작성순서 ]
 * 
 * 1. Socket 객체 생성 : 생성됨과 동시에 서버에 소켓 접속을 시도함
 * 		- 접속할 서버의 ip주소와 port번호가 피룡하다
 * 2. Socket 객체를 이용해서 서버와 통신하기
 * 3. 필요한 작업을 완료한 후 Socket 객체 닫아주기
 */
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		//Scanner 객체를 이용해서 서버로 전송할 문자열을 입력 받는다.
		Scanner scan=new Scanner(System.in);
		System.out.println("서버로 전송할 메세지 입력 : ");
		String msg=scan.nextLine();
		//필요한 객체를 담을 변수 만들기
		Socket socket=null;
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		try{
			//연결 요청할 com의 ip주소와 port번호를 생성자의 인자로
			//전달해서 Socket객체를 생성한다.
			//자동으로 연결 요청이 된다.
			socket=new Socket("192.168.0.18",5000);
			//서버에 출력하기 위한 객체를 얻어온다.
			os=socket.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			//서버로 메시지를 출력하기
			bw.write(msg);
			bw.newLine();//개행기호
			bw.flush();//밀어내기
			
			System.out.println("Socket 서버에 접속 성공!");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(os!=null)os.close();
				if(osw!=null)osw.close();
				if(bw!=null)bw.close();
				if(socket!=null)socket.close();
			}catch(Exception e){}
		}
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
