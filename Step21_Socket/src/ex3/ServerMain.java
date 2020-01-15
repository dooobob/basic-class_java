package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		/*
		 * 메인 스레드에서는 클라이언트의 Socket 접속을 대기하고 있다가
		 * 접속을 해오면 클라이언트와 연결된 Socket 객체를 반환하고
		 * 새로운 스레드를 만들어서 클라이언트가 전송한 파일을 다운로드하는
		 * 작업을 시키고 다시 클라이언트의 Socket접속을 기다린다.
		 */
		ServerSocket server=null;
		try{
			server=new ServerSocket(5000);
			while(true){
				//클라이언트의 접속을 대기하고 있다가 접속을 해오면
				//Socket객체의 id를 얻어낸다.
				Socket socket=server.accept();
				//생성자의 인자로 Socket 객체를 전달하면서 객체를 생성한다.
				Thread thread=new FileDownThread(socket);
				//새로운 스레드(작업단위)시작 시키기
				thread.start();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(server!=null)server.close();
			}catch(Exception e){}
		}
	}
	static class FileDownThread extends Thread{
		//특정 클라이언트와 연결된 Socket객체의 id를 담을 멤버필드
		private Socket socket;
		
		//생성자
		public FileDownThread(Socket socket){
			this.socket=socket;
		}
		
		@Override
		public void run() {
			//필요한 객체를 담을 변수 만들기
			InputStream is=null;
			FileOutputStream fos=null;
			try{
				//파일을 전송한 클라이언트의 ip주소
				String ip=socket.getInetAddress().getHostAddress();
				//파일을 저장 할 경로와 파일명 정하기
				String path="c:/myFolder/"+ip+"image.jpg";
				//필요한 객체의 id 얻어내서 변수에 대입하기
				is=socket.getInputStream();
				fos=new FileOutputStream(path);
				byte[] buffer=new byte[1024];
				while(true){
					int readedByte=is.read(buffer);
					if(readedByte==-1)break;
					//읽어들인 만큼 파일에 출력하기
					fos.write(buffer, 0, readedByte);
					fos.flush();
				}
				System.out.println("파일 저장 성공!");
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(is!=null)is.close();
					if(fos!=null)fos.close();
					if(socket!=null)socket.close();
				}catch(Exception e){}
			}//try			
		}//run()
	}//class FileDownThread
}//class ServerMain
