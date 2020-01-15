package test.main;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("임의의 정수 입력 : ");
		int num=scan.nextInt();
		
		//switch 문으로 분기하기
		switch(num){//switch(int Type or char Type)
			case 0:
				System.out.println("0입니다.");
				break;
			case 1:
				System.out.println("1입니다.");
				break;
			case 2:
				System.out.println("2입니다.");
				break;
			default:
				System.out.println("0, 1, 2 모두 아닙니다.");		
		}
	}
}
