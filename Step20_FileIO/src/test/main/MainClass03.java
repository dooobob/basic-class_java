package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) throws IOException {
		File file=new File("c:/myFolder/myMemo.txt");
		//파일에서 문자를 읽어 들일 수 있는 FileReader 객체 생성하기 
		FileReader fr=new FileReader(file);
		//방 100개짜리 char[] 객체 생성하기(최대100글자)
		char[] buffer=new char[100];
		fr.read(buffer);
		fr.close();
		
		//읽은 내용을 콘솔에 출력해보기
		for(char tmp:buffer){
			System.out.print(tmp);
		}
	}
}
