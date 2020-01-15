package test.util;

public class YourUtil {
	//일반 멤버필드
	public int callCount;
	//static 멤버필드
	public static String name="Your Util";

	//일반 멤버 메소드
	public void make(){
		callCount++;
		System.out.println("무언가를 만들어요!");		
	}
	public void showInfo(){
		System.out.println("name : "+name);
		System.out.println("만든 횟수 : "+callCount);
	}
}
