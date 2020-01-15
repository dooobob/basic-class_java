package test.main;

import test.mypac.MemberDto;
import test.mypac.MyUtil;

public class MainClass04 {
	public static void main(String[] args) {
		
		MyUtil.showInfo(1, "김구라", "노량진");
		
		//한명의 회원정보를 MemberDto객체에 담는다.
		MemberDto dto=new MemberDto(2,"해골"," 행신동");
		//MyUtil 클래스의 static 멤버 메소드를 호출하면서 Member Dto Type id를 전달한다.
		MyUtil.showInfo2(dto);
		
		//디폴트 생성자를 호출해서 MemberDto 객체를 생성한다.
		MemberDto dto2=new MemberDto();
		//생성한 객체의 setter 메소드를 이용해서 번호, 이름, 주소를 담는다.
		dto2.setNum(3);
		dto2.setName("원숭이");
		dto2.setAddr("상도동");
		
		//회원의 번호, 이름, 주소 정보를 가지고 있는 MemberDto 객체를 전달하면서 메소드 호출
		MyUtil.showInfo2(dto2);
	}
}
