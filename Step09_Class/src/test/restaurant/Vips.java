package test.restaurant;

public class Vips {
	//멤버필드
	public String branch;//지점명을 저장할 멤버필드
	
	//스테이크를 주문하는 멤버메소드
	public Steak getSteak(){
		//Steak 객체를 생성해서 참조값을 변수에 담는다.
		Steak s=new Steak();
		//변수에 담긴 참조값을 리턴해준다.
		return s;
	}
	//Pasta를 주문하는 멤버 메소드
	public Pasta getPast(){
		//Pasta 객체를 생성해서 참조값을 변수에 담는다.
		Pasta p=new Pasta();
		//변수에 담긴 Pasta를 리턴해준다.
		return p;
	}
}
