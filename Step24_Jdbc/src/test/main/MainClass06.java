package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

/*
 * Oracle DB의 member 테이블에 특정회원의 정보를 수정하는 예제
 */
public class MainClass06 {
	public static void main(String[] args) {
		//수정할 회원의 정보라고 가정하자
		int num=1;
		String name="개구라";
		String addr="노량진";
		//수정할 회원의 정보를 MemberDto 객체에 담는다.
		MemberDto dto=new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		
		//MemberDao객체의 id를 얻어와서 변수에 담는다.
		MemberDao dao=MemberDao.getInstance();
		//회원의 정보를 수정하고 결과값을 boolean Type으로 받는다.
		boolean isSuccess=dao.update(dto);
		if(isSuccess){
			System.out.println("회원정보 수정 성공!");
		}else{
			System.out.println("회원정보 수정 실패!");
		}
	}
}
