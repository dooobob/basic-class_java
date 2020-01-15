package test.main;

import java.util.Random;

/*
 * 무작위 수가 필요하다면?
 */
public class MainClass08 {
	public static void main(String[] args) {
		Random ran=new Random();
		//Random 객체를 이용해서 랜덤한 정수 얻어내기
		int num1=ran.nextInt(10);
		System.out.println("0~9 : "+num1);
		int num2=ran.nextInt(10)+1;
		System.out.println("1~10 : "+num2);		
		int num3=ran.nextInt(100)+1;
		System.out.println("1~100 : "+num3);		
		//1~45 사이의 랜덤한 정수를 얻어내 보세요!
		int num4=ran.nextInt(45)+1;
		System.out.println("1~45 : "+num4);		
		//75~100 사이의 랜덤한 정수를 얻어내 보세요!
		int num5=ran.nextInt(26)+75;
		System.out.println("75~100 : "+num5);		
		//-15~15 사이의 랜덤한 정수를 얻어내 보세요!
		int num6=ran.nextInt(31)-15;
		System.out.println("-15~15 : "+num6);		
		//for(int i=0;i<1000;i++){
		//	int num=ran.nextInt(100);
		//	System.out.println(num+1);
		//}
	}
}
