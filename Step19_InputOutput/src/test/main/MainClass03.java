package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * [ BufferdReader ]
 * 
 * - 입력한 문자를 갯수에 상관없이 String Type으로 얻어낼 수 있다.
 */
public class MainClass03 {
	public static void main(String[] args) {
		InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is);
		//InputStreamReader Type의 id를 생성자의 인자로 전달해서
		//BufferedReader 객체를 생성한다.
		BufferedReader br=new BufferedReader(isr);
		System.out.print("한글자 입력 : ");
		try {
			//입력한 문자열을 String Type으로 받아온다.
			String str=br.readLine();
			System.out.println("입력한 글자 : "+str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
