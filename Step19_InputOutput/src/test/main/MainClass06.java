package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainClass06 {
	public static void main(String[] args) {
		OutputStream os=System.out;
		//OutputStream 객체의 id를 생성자의 인자로 전달해서
		//OutputStreamWriter 객체를 생성한다.
		OutputStreamWriter osw=new OutputStreamWriter(os);
		try {
			osw.write("여러개의 문자를 한번에 출력해요! 오예~\n");
			osw.flush();
			char[] buffer={'가','나','다','라'};
			osw.write(buffer);
			osw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
