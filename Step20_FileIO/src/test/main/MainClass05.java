package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass05 {
	public static void main(String[] args) {
		//필요한 객치를 담을 변수 만들기
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//필요한 객체의 참조값(id) 얻어내서 변수에 대입하기
			fis=new FileInputStream("c:/myFolder/myImage.jpg");
			fos=new FileOutputStream("c:/myFolder/copiedImage.jpg");
			
			//한번에 읽어올 byte의 크기를 고려해서 byte[]객체 생성하기
			byte[] buffer=new byte[1024];
			//전체 파일의 크기를 누적할 변수
			int fileSize=0;
			while(true){
				//byte[]객체를 메소드의 인자로 전달해서 읽는다.
				int readedByte=fis.read(buffer);
				//더이상 읽을 데이터가 없다면 반복문 탈출(fis.read(buffer)가 -1을 리턴한다)
				if(readedByte==-1)break;
				//읽어들인만큼 출력하기
				fos.write(buffer,0,readedByte);
				fos.flush();
				//파일의 크기 누적하기
				fileSize+=readedByte;
			}
			System.out.println(fileSize+" bytes 복사 성공");
		} catch (Exception e) {			
			e.printStackTrace();
		}finally{
			//Exception이 발생하던 안하던 반드시 실행이 보장되는 블럭에서			
			try{
				//마무리 작업을 해준다.
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			}catch(Exception e){}
		}
	}
}