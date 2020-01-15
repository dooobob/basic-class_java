package test.mypac;
/*
 * Object 클래스를 상속(extends) 받아서 Phone 클래스 정의하기
 */
public class Phone {//extends Object가 생략되어 있다
	
	//생성자
	public Phone(){
		System.out.println("Phone() 생성자 호출!");
	}
	
	//멤버 메소드
	public void call(){
		System.out.println("전화를 걸어요");		
	}
	
}
