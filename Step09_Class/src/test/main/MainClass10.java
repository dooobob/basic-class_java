package test.main;

import test.util.MyUtil;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		new MyUtil().send("\"안녕하세요\"");
		System.out.println(new MyUtil().AUTHOR);
		*/
		
		//static 멤버 메소드 사용하기
		MyUtil.send("안녕하세요");//static 멤버는 클래스명으로 참조한다.
		
		//static 멤버필드 참조하기
		System.out.println(MyUtil.AUTHOR);
		
		//MyUtil 객체 생성해서 id 값을 변수에 담기
		MyUtil util=new MyUtil();
		util.test();//일반 멤버는 id값으로 참조한다
		System.out.println(util.myMoney);
	}
}
