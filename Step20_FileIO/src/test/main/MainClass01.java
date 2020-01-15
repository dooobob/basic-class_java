package test.main;

import java.io.File;
import java.io.IOException;

/*
 * [ File 객체 ]
 */
public class MainClass01 {
	public static void main(String[] args) throws IOException {
		//File 객체를 이용해서 폴더 만들기
		File file1=new File("c:/myFolder");
		file1.mkdir();
		
		//File 객체를 이용해서 파일 만들기
		File file2=new File("c:/myFolder/text.txt");
		file2.createNewFile();
		
		//특정경로, 혹은 폴더안에 내용 목록 얻어오기
		File file3=new File("c:/");
		String[] names=file3.list();
		for(String tmp:names){
			System.out.println(tmp);
		}
		
		System.out.println("-------------------------");
		//파일의 내용을 좀더 자세히 출력해보기
		File file4=new File("c:/");
		File[] files=file4.listFiles();
		for(File tmp:files){
			//파일 혹은 디렉토리의 이름
			String name=tmp.getName();
			//디렉토리인지 파일인지 판별한다.
			if(tmp.isDirectory()){//디렉토리인 경우
				System.out.println("[d]"+name);
			}else{//파일인 경우
				System.out.println(name);
			}
		}
	}
}
