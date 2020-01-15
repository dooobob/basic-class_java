package test.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Map;

public class MainClass09 {
	public static void main(String[] args) {
		//필요한 객체를 담을 공간 만들기
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try{
			//필요한 객체의 id를 얻어내서 변수에 대입하기
			fis=new FileInputStream("c:/myFolder/gura.dat");
			ois=new ObjectInputStream(fis);		
			//readObject()메소드를 이용해서 Object Type으로 읽어와서
			//원래 Type인 Map Type으로 casting 해서 담는다.
			Map<String, Object> map=
					(Map<String, Object>)ois.readObject();
			//저장된 정보 읽어오기
			int num=(int)map.get("num");
			String name=(String)map.get("name");
			String addr=(String)map.get("addr");
			System.out.println("--- 파일에서 읽어온 정보 ---");
			System.out.println(num+"/"+name+"/"+addr);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(ois!=null)ois.close();
				if(fis!=null)fis.close();
			}catch(Exception e){}
		}
	}
}
