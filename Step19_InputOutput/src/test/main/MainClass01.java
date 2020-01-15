package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 * [ InputStream ]
 * 
 * - 1byte 처리 스트림(byte 알갱이의 흐름)
 * - 영문자 대소문자, 숫자, 특수문자 한글자 읽어들일 수 있다
 * - 한글은 처리 불가
 */
public class MainClass01 {
	public static void main(String[] args) {
		//키보드로부터 한개의 글자코드를 입력 받아서 콘솔에 출력해보기
		//키보드와 연결된 객체를 InputStream Type으로 얻어오기
		InputStream is=System.in;
		System.out.print("한글자 입력 : ");
		try {
			//입력받은 문자의 코드값을 읽어온다.
			int keyCode=is.read();
			System.out.println("입력한 문자의 코드값 : "+keyCode);
			//코드에 해당되는 문자를 얻어낸다.
			char ch=(char)keyCode;
			System.out.println("char Type으로 변환한값 : "+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인메소드가 종료됩니다.");
	}
}
