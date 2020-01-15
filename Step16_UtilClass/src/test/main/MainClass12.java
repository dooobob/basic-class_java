package test.main;

import java.util.Scanner;

/*
 * 문자열(String) Type 데이터를 효율적으로 누적 시키기위한 객체
 * 
 * - StringBuffer
 * - StringBuilder
 */
public class MainClass12 {
	public static void main(String[] args) {
		//문자열을 입력받기 위한 Scanner 클래스 정의하기
		Scanner scan=new Scanner(System.in);
		//문자열을 누적시키기 위한 객체 생성하기
		StringBuilder builder=new StringBuilder();
		//String str="";
		while(true){
			System.out.println("문자열 입력(종료:q or Q) : ");
			String msg=scan.nextLine();//문자열 입력받기
			if(msg.equals("q")||msg.equals("Q")) break;
			//StringBuilder 객체에 누적 시키기
			builder.append(msg);
			//str=str+msg;
		}
		//누적시킨 문자열을 한번에 String Type으로 얻어내기
		String result=builder.toString();
		//결과값 출력해보기
		System.out.println(result);
	}
	
}
