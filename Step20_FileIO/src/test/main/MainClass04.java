package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) throws IOException {
		File file=new File("c:/myFolder/myMemo.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		//문자열(String을 누적 시키기 위한 객체 생성
		StringBuilder sb=new StringBuilder();
		//반복문 돌면서 문자열을 줄단위로 읽어오기
		while(true){			
			//한줄 읽어오기
			String line=br.readLine();
			if(line==null){//더 이상 읽을 데이터가 없다면
				//(readLine()이 읽은게 없으면 null을 리턴함)
				break;//반복문 탈출
			}
			//읽어온 문자열을 출력해보기			
			//System.out.println(line);
			//읽어온 문자열 누적시키기
			sb.append(line+"\r\n");
		}
		//누적된 문자열 한번에 출력해보기
		System.out.println(sb.toString());
	}
}
