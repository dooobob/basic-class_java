package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Scanner 객체를 이용해서 문자열을 입력받아서
 * 실제 파일에 문자열을 저장하는 작업을 해보세요!
 */
public class MainClass06 {
	public static void main(String[] args){
		//키보드로부터 입력받기 위한 객체 생성
		Scanner scan=new Scanner(System.in);
		
		//파일에 출력하기 위한 객체
		File file=new File("c:/myFolder/myString.txt");
		//FileWriter 객체를 저장할 공간을 만들어 놓고
		FileWriter fw=null;
		try{
			//FileWriter 객체의 id를 얻어내서 변수에 대입한다.
			fw=new FileWriter(file);
			System.out.println("문자열을 입력하세요(나가기:'q'or'Q') : ");
			//q혹은 Q를 입력 할 때까지 문자열을 입력 받는다.
			while(true){
				//Scanner 객체를 이용해서 문자열을 입력 받는다.
				String str=scan.nextLine();
				if(str.equals("q")||str.equals("Q")) break;
				//파일에 저장하기
				fw.write(str+"\r\n");
				fw.flush();	
			}						
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				//이 시점에서 실제로 파일이 만들어 진다.
				if(fw!=null) fw.close();
			}catch(Exception e){}
		}
	}
}
