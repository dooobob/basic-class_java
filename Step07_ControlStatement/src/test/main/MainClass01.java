package test.main;

//필요한 클래스 import하기
import java.util.Scanner;

public class MainClass01 {
	//프로그램 실행흐름의 시작이 되는 메인메소드
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		//Scanner Type 객체 생성해서 id 값 버리기
		new Scanner(System.in);
		
		//Scanner Type 객체 생성해서 id값을 Scanner Type 변수 scan에 저장하기
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str=scan.nextLine();
		
		System.out.println("문자열을 또 입력하세요 : ");
		String str2=scan.nextLine();
		
		System.out.println("문자열을 또 다시 입력하세요 : ");
		String str3= new Scanner(System.in).nextLine();
		
		System.out.println("입력한 문자열 : "+str);
		System.out.println("입력한 문자열2 : "+str2);
		System.out.println("입력한 문자열3 : "+str3);
		System.out.println("메인 메소드가  return됩니다.");
	}
}
