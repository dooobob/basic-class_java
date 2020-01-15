package test.main;

import java.util.Scanner;

/*
 * Quiz
 * 
 * 1. Scanner 객체를 하나 생성해서 변수에 담는다.
 * 2. Scanner 객체를 이용해서 친구의 숫자를 입력받는다.
 * 	(예를 들어 친구 숫자를 5라고 답했다면)
 * 3. 방 5개짜리 String[] 객체를 생성한다.
 * 4. Scanner 객체를 이용해서 친구의 이름을 친구의 숫자 많큼 반복해서 입력받아서
 * 	위에서 만든 String[]객체에 순서대로 누적시킨다.
 * 5. String[] 객체에 저장된 친구 이름을 순서대로 출력해본다.
 */
public class MainClass04 {
	public static void main(String[] args) {
		//1.
		Scanner scan=new Scanner(System.in);
		//2.
		System.out.println("숫자를 입력하세요.");
		int friendCount=scan.nextInt();
		//3.
		String[] names=new String[friendCount];
		//scan.nextLine();
		//4.		
		for(int i=0;i<friendCount;i++){
			System.out.println((i+1)+"번째 친구의 이름을 입력하세요");
			//Scanner 객체를 이용해서 이름을 입력받는다.
			String name=scan.next();
			//입력받은 이름을 배열의 i번째 방에 저장한다.
			names[i]=name;			
		}
		//5.
		for(String tmp:names){
			System.out.println(tmp);
		}
	}
}
