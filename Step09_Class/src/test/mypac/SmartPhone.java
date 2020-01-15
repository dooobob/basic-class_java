package test.mypac;

public class SmartPhone {
	//멤버필드 정의하기
	public String phoneNumber;//전화번호
	public String company;//제조사
	public String os;//운영체제
	
	//전화거는 멤버 메소드
	public void call(){
		System.out.println("전화를 걸어요");
	}
	//문자를 보내는 멤버 메소드
	public void sendMessage(){
		System.out.println("문자를 보내요");
	}
	//웹서핑을 하는 멤버 메소드
	public void doInternet(){
		System.out.println("웹서핑을 해요");
	}
}
