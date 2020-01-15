package test.main;
/*
 * Oracle DB에 저장된 회원정보를 모두 읽어와서 콘솔창에 출력하는 예제
 */
import java.util.ArrayList;
import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		//MemberDao 객체의 id를 얻어온다
		MemberDao dao=MemberDao.getInstance();
		//dao객체의 getList()메소드를 이용해서 회원목록을 얻어온다.
		List<MemberDto> list=dao.getList();
		
		for(MemberDto tmp:list){			
			System.out.println(tmp.getNum()+"/"+tmp.getName()+"/"+tmp.getAddr());
		}
	}
}
