package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

/*
 * Scanner 객체를 이용해서 입력한 번호에 해당하는 회원 1명의 정보를
 * 콘솔창에 출력하는 예제
 */
public class MainClass08 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("검색할 회원의 번호 입력 : ");
		int num=scan.nextInt();
		
		//MemberDao 객체의 id값 얻어오기
		MemberDao dao=MemberDao.getInstance();
		//dao객체의 getData()메소드를 호출해서 MemberDto 객체를 얻어온다.
		MemberDto dto=dao.getData(num);
		if(dto==null){
			System.out.println(num+"번 회원은 존재하지 않습니다.");
		}else{
			System.out.println(num+"번 회원의 정보입니다.");
			System.out.println("이름 : "+dto.getName());
			System.out.println("주소 : "+dto.getAddr());			
		}
	}
}
