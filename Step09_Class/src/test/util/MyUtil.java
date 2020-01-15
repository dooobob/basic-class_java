package test.util;

public class MyUtil {
	//static 멤버필드 정의하기
	public static final String AUTHOR="김구라";
	//일반 멤버필드
	public int myMoney;
	
	//static 멤버 메소드
	public static void send (String msg){
		System.out.println("인터넷을 통해서 "+msg+"를 전송했습니다.");
	}
	
	//일반 멤버필드
	public void test(){
		System.out.println("test() 호출!");
	}
}
