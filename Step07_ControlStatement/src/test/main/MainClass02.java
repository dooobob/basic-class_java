package test.main;

import java.util.Scanner;

public class MainClass02 {
	//프로그램 실행흐름의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		//Scanner Type 객체 생성해서 변수에 담기
		Scanner scan=new Scanner(System.in);
		//0보다 큰 정수를 입력받아서 int Type변수에 담기
		System.out.println("0보다 큰 정수를 입력하세요");
		int num=scan.nextInt();
		//입력한 정수가 0보다 클때만 출력하기 위해
		if(num>0){
			System.out.println("입력한 정수 : "+num);
		}
		
		System.out.println("메인 메소드가 return 됩니다.");
	}
}
