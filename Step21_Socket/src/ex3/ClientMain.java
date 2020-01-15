package ex3;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientMain {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수
		Socket socket=null;
		OutputStream os=null;
		FileInputStream fis=null;
		try{
			//서버에 접속 요청
			socket=new Socket("192.168.0.18",5000);
			//서버에 출력할 스트림 객체의 id얻어오기
			os=socket.getOutputStream();
			//파일에서 읽어들일 스트림객체의 id얻어오기
			fis=new FileInputStream("c:/myFolder/image.jpg");
			//파일에서 byte알갱이를 읽어올 객체
			byte[] buffer=new byte[1024];//한번에 1kbyte
			//반복문 돌면서 파일에서 읽어들이고 동시에 출력하기
			while(true){
				//fis 객체의 read()메소드를 이용해서 읽어들인다.
				int readedByte=fis.read(buffer);
				//더이상 읽을 데이터가 없다면 반복문 빠져 나오기
				if(readedByte==-1)break;
				//읽어온만큼 os객체를 이용해서 출력한다.
				os.write(buffer, 0, readedByte);
				//(buffer,인덱스0번,읽은곳까지)
				os.flush();
			}
			System.out.println("파일전송 성공!");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(os!=null)os.close();
				if(fis!=null)fis.close();
				if(socket!=null)socket.close();
			}catch(Exception e){}
		}
	}
}
