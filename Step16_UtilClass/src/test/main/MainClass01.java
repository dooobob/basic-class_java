package test.main;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * [ ArrayList ]
 * 
 * - 가변 배열이다.
 * - 객체를 생성해서 id값으로 사용해야 한다.
 * - 순서가 있다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//Scanner Type의 id를 얻어내서 변수에 담기
		Scanner scan=new Scanner(System.in);
		//가변 배열 객체 생성해서 id값을 변수에 담기
		ArrayList list=new ArrayList();
		while(true){
			System.out.println("친구 이름 입력 : (나가기 : q or Q)");
			//이름을 입력 받아서
			String name=scan.nextLine();
			//q나 Q를 입력하면 반복문 탈출 조건
			if(name.equals("q") || name.equals("Q")){
				break;
			}
			//가변 배열객체에 저장하기
			list.add(name);
		}
		
		//모든 친구의 이름을 하나하나 반복문 돌면서 출력하기
		for(int i=0;i<list.size();i++){
			String tmp=(String)list.get(i);
			System.out.println(i+1+"번째 친구이름 : "+tmp);
		}
		
	}
}
