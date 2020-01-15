package test.main;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass01 {
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
			//강제로 예외 객체를 생성해서 던지기
			//throw new SQLException();
			
		}catch(ArithmeticException ae){
			System.out.println("어떤 수를 0으로 나눌 수는 없습니다.");
			ae.printStackTrace();
		}catch(InputMismatchException ime){
			System.out.println("숫자 형태로 입력해야 합니다.");
		}catch(Exception e){
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();
		}
		
		System.out.println("메인 메소드가 리턴 됩니다.");
	}
}
