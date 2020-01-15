package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		//키보드로 부터 입력 받기 위한 객체 생성하기
		Scanner scan=new Scanner(System.in);
		try{
			System.out.println("젯수 입력:");
			int num1=scan.nextInt();
			System.out.println("피젯수 입력 : ");
			int num2=scan.nextInt();
			//num2를 num1으로 나눈 몫을 변수에 저장
			int mog=num2/num1;
			//num2를 num1으로 나눈 나머지를 변수에 저장
			int na=num2%num1;
			System.out.println(num2+"를 "+num1+"으로 나눈 결과");
			System.out.println("몫 : "+mog+"  나머지 : "+na);
		}catch(Exception e){
			System.out.println("예외 발생!");
			e.printStackTrace();
		}finally{//Exception이 발생을 하던 안하던 무조건 수행이 보장되는 블럭
			System.out.println("시스템을 정리합니다...");
		}
		
		System.out.println("메인 메소드가 리턴 됩니다.");		
	}
}
