package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 텍스트 파일을 생성하고 문자열 기록하기
 */
public class MainClass02 {
	public static void main(String[] args) throws IOException {
		//File 객체 생성
		File file=new File("c:/myFolder/myMemo.txt");
		//File 객체를 생성자의 인자로 전달해서 FileWriter 객체 생성하기
		FileWriter fw=new FileWriter(file);
		fw.write("김구라\r\n");
		fw.write("해골\r\n");
		fw.write("원숭이\r\n");
		
		fw.flush();
		fw.close();//close()시점에 파일이 만들어진다.
	}
}
