package test.pac;

public class SmartPhone extends HandPhone{
	
	//생성자
	public SmartPhone(){
		System.out.println("SmartPhone() 생성자 호출");
	}
	
	//일반 멤버 메소드
	public void doInternet(){
		System.out.println("인터넷을 해요!");
	}
	//부모 클래스에 정의된 메소드 재 정의(오버라이드)하기
	@Override //어노테이션
	public void takePicture() {
		// 부모객체의 메소드를 호출하는 방법 super.메소드명()
		//super.takePicture();
		System.out.println("500만 화소의 사진을 찍어요!");
	}
}