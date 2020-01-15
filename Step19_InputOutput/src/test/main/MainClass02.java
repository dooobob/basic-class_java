package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * [ InputStreamReader ]
 * 
 * - 2byte 처리 스트림
 * - 한글을 포함한 모든 문자 1글자를 처리할 수 있다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		InputStream is=System.in;
		//키보드와 연결된 InputStream 객체의 아이디를 생성자의 인자로
		//전달하면서 InputStreamReader 객체 생성하기
		InputStreamReader isr=new InputStreamReader(is);
		System.out.print("한글자 입력 : ");
		try {
			int data=isr.read();
			System.out.println("data : "+data);
			//char Type 으로 변환
			char ch=(char)data;
			System.out.println("입력한 글자 : "+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
