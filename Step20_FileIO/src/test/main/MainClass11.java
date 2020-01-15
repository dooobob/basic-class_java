package test.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import test.dto.MemberDto;

/*
 * member.dat 파일에 들어있는 정보를 이용해서
 * 회원정보를 콘솔창에 출력해보세요.
 */
public class MainClass11 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try{
			fis=new FileInputStream("c:/myFolder/members.dat");
			ois=new ObjectInputStream(fis);		
			List<MemberDto> list=
					(List<MemberDto>) ois.readObject();
			for(MemberDto tmp:list){
				int num=tmp.getNum();
				String name=tmp.getName();
				String addr=tmp.getAddr();
				System.out.println(num+"/"+name+"/"+addr);
			}
			/*for(int i=0;i<list.size();i++){
				MemberDto mem=list.get(i);
				int num=mem.getNum();
				String name=mem.getName();
				String addr=mem.getAddr();
				System.out.println(num+"/"+name+"/"+addr);
			}*/
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
