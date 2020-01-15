package test.main;
/*
 * ObjectOutputStream()객체로 저장 할 객체는 
 * Serializable 가 구현되어 있어야 한다.
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		
		//필요한 객체를 담을 변수 만들기
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try{
			fos=new FileOutputStream("c:/myFolder/gura.dat");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(map);
			System.out.println("파일에 객체를 저장했습니다.");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			}catch(Exception e){}
		}
	}
}
