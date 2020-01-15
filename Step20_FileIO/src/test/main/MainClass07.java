package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * MainClass06에서 저장한 파일의 내용을 모두 읽어와서 출력해보세요
 */
public class MainClass07 {
	public static void main(String[] args){
		BufferedReader br=null;
		try{
			//BufferedReader 객체의 id를 얻어내서 변수에 대입한다.
			br=new BufferedReader
					(new FileReader("c:/myFolder/myString.txt"));
			//반복문 돌면서 읽어들이기
			while(true){
				//한줄씩 줄단위로 읽어들인다.
				String msg=br.readLine();
				//더이상 읽을 데이터가 없다면 반복문 탈출
				if(msg==null) break;
				//읽은 문자열을 콘솔창에 출력
				System.out.println(msg);				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(br!=null) br.close();
			}catch(Exception e){}
		}
		
		
		/*File file=new File("c:/myFolder/myString.txt");
		FileReader fr=null;
		char[] buffer=new char[100];
		try {
			fr=new FileReader(file);
			fr.read(buffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				fr.close();
			}catch(Exception e){}
		}	
		
		for(char tmp:buffer){
			System.out.print(tmp);
		}*/
	}
}
