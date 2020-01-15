package test.mypac;
/*
 * Phone 클래스를 extends해서 HandPhone 클래스 정의하기
 */
public class HandPhone extends Phone{
	
	//생성자
	public HandPhone(){
		System.out.println("HandPhone() 생성자 호출!");
	}
	
	//멤버 메소드 정의하기
	public void mobileCall(){
		System.out.println("이동중에 전화를 걸어요!");
	}
	
	public void takePicture(){
		System.out.println("30만 화소 사진을 찍어요!");
	}

}
