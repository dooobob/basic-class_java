package test.main;

import java.util.Scanner;

/*
 * 1. Scanner 객체를 이용해서 정수를 입력받는다
 * 2. 입력한 정수가 짝수이면 "입력한 수는 짝수 입니다" 를 출력하고
 * 3. 입력한 정수가 짝수가 아니라면 "입력한 수는 홀수입니다"를 출력해보세요
 * 4. hint : 10%2=>0	9%2=>1 (나머지 연산자를 사용해보세요)
 */
public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num=scan.nextInt();
		
		if(num%2==0){
			System.out.println("입력한 수는 짝수입니다.");
		}else{
			System.out.println("입력한 수는 홀수입니다.");
		}
	}
}
