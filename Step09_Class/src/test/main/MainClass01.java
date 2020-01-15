package test.main;

import test.mypac.Customer;

public class MainClass01 {
	public static void main(String[] args) {
		//Customer 객체 생성해서 id값 버리기
		new Customer();
		
		//Customer 객체 생성해서 id값을 Customer Type 변수에 담기
		Customer c1=new Customer();
		c1.choose();
		c1.pay();
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		
		c1.name="원숭이";
		c1.age=41;
		
		System.out.println("멤버필드의 값을 수정 한 후");
		
		System.out.println(c1.name);
		System.out.println(c1.age);
	}
}
