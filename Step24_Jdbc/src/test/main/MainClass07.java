package test.main;

import java.util.Scanner;

import test.dao.MemberDao;

/*
 * Oracle DB에서 회원 한명의 정보를 삭제하는 예제
 */
public class MainClass07 {
	public static void main(String[] args) {
		//Scanner 객체를 이용해서 삭제할 회원의 번호를 입력 받는다.
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 회원 번호입력 : ");
		int num=scan.nextInt();
		
		//MemberDao객체의 id를 얻어온다.
		MemberDao dao=MemberDao.getInstance();
		//dao 객체의 /delete() 메소드를 이용해서 삭제후 결과값을 boolean Type으로 받는다.
		boolean isSuccess=dao.delete(num);
		
		if(isSuccess){
			System.out.println(num+"번 회원정보 삭제 성공!");
		}else{
			System.out.println(num+"번 회원은 존재하지 않습니다.");
		}
	}
}
