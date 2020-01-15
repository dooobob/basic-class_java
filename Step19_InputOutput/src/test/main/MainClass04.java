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
public class MainClass04 {
	public static void main(String[] args) throws IOException {
		//BufferedReader Type id를 한줄의 표현식으로 얻어내기
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		System.out.print("한글자 입력 : ");
		//입력한 문자열을 String Type으로 받아온다.
		String str=br.readLine();
		System.out.println("입력한 글자 : "+str);				
	}
}
