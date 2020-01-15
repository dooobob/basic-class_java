package test.main;

import test.mypac.SmartPhone;

/*
 * 1. SmartPhone 객체를 한개 생성해서 id값을 변수에 담는다.
 * 2. 전화번호 : "010-1111-2222", 제조사 : "Samsung", 운영체제 : "Android"
 * 	  와 같이 멤버필드에 값을 넣어준다.
 * 3. 전화를 걸고, 문자를 보내고, 웹서핑을 해보세요
 */
public class MainClass03 {
	public static void main(String[] args) {
		SmartPhone sp1=new SmartPhone();
		SmartPhone sp2=new SmartPhone();
		
		sp1.phoneNumber="010-1111-2222";
		sp1.company="Samsung";
		sp1.os="Android";
		
		sp2.phoneNumber="010-3333-4444";
		sp2.company="Apple";
		sp2.os="IOS";
		
		sp1.call();
		sp1.sendMessage();
		sp1.doInternet();
		
		sp2.call();
		sp2.sendMessage();
		sp2.doInternet();
	}
}
