package test.main;

import java.util.Scanner;

/*
 * 1. Scanner 객체를 이용해서 임의의 정수를 입력 받는다.
 * 2. 임력한 수가 양수이면 "입력한 수는 양수입니다."
 * 3. 입력한 수가 음수이면 "입력한 수는 음수입니다."
 * 4. 입력한 수가 0이면 "입력한 수는 0입니다."를 출력하도록 programming 해보세요
 */
public class MainClass04 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("임의의 정수를 입력하세요.");
		int num=scan.nextInt();
					
		if(num>0){
			System.out.println("입력한 수는 양수입니다.");
		}else if(num<0){
			System.out.println("입력한 수는 음수입니다.");
		}else{
			System.out.println("입력한 수는 0입니다.");
		}
		
		System.out.println("메인메소드가 return됩니다.");
	}
}
