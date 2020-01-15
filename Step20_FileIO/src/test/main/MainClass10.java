package test.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		MemberDto mem1=new MemberDto(1,"김구라","노량진");
		MemberDto mem2=new MemberDto(2,"해골","행신동");
		MemberDto mem3=new MemberDto(3,"원숭이","상도동");
		MemberDto mem4=new MemberDto(4,"주뎅이","봉천동");
		
		List<MemberDto> list=new ArrayList<MemberDto>();
		list.add(mem1);
		list.add(mem2);
		list.add(mem3);
		list.add(mem4);
		//ArrayList객체의 정보를 파일에 저장하기 위한 작업
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try{
			fos=new FileOutputStream("c:/myFolder/members.dat");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			System.out.println("객체(정보)를 파일에 저장 했습니다.");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(fos!=null)fos.close();
				if(oos!=null)oos.close();
			}catch(Exception e){}
		}
	}
}
