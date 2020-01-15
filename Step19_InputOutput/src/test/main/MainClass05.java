package test.main;

import java.io.IOException;
import java.io.OutputStream;

public class MainClass05 {
	public static void main(String[] args) throws IOException {
		//콘솔창에 연결된 객체의 참조값을 OutputStream Type변수에 담기
		OutputStream os=System.out;
		//한글자씩 콘솔에 출력하기
		os.write(97);
		os.write(98);
		os.write(99);
		os.write(100);
		os.write(101);
		os.flush();//데이터 밀어내기(방출)
		
		//출력할 코드값을 byte[]객체에 담아서
		byte[] buffer={65,66,67,68,69};
		
		//배열 째로 전달해서
		os.write(buffer);
		os.flush();//출력하기
		
		os.close();//스트림 닫기
		
		//스트림 닫은 이후에는 출력 불가
		os.write(100);
		os.flush();
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
