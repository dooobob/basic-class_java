package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		//MemberDto 객체 생성해서
		MemberDto mem1=new MemberDto();
		//setter 메소드를 이용해서 멤버필드에 값 저장하기
		mem1.setNum(1);
		mem1.setName("김씨");
		mem1.setAddr("서울");
		
		//MemberDto 객체를 생성하면서 회원의 정보를 전달한다.
		MemberDto mem2=new MemberDto(2, "이씨", "인천");
		MemberDto mem3=new MemberDto(3, "박씨", "대전");
		
		List<MemberDto> list=new ArrayList<MemberDto>();
		list.add(mem1);
		list.add(mem2);
		list.add(mem3);
		
		//반복문 돌면서 정보 출력해보기
		for(int i=0;i<list.size();i++){
			//i번째 MemberDto 객체의 id 불러오기
			MemberDto tmp=list.get(i);
			//객체에 담긴 정보를 getter 메소드를 이용해서 불러오기
			int num=tmp.getNum();
			String name=tmp.getName();
			String addr=tmp.getAddr();
			//정보 출력해보기
			System.out.println("번호 : "+num+"\n이름 : "+name+"\n주소 : "+addr+"\n\n");
		}		
		//확장 for문으로 작성해보세요
		for(MemberDto tmp:list){
			//객체에 담긴 정보를 getter 메소드를 이용해서 불러오기
			int num=tmp.getNum();
			String name=tmp.getName();
			String addr=tmp.getAddr();			
			//정보 출력해보기
			System.out.println("번호 : "+num+"\t\t이름 : "+name+"\t주소 : "+addr);
		}
		
	}
}
