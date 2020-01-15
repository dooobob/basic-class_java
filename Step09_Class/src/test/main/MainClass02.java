package test.main;

import test.mypac.Customer;

public class MainClass02 {
	public static void main(String[] args) {
		//Customer Type 객체 2개 만들기
		Customer c1=new Customer();
		Customer c2=new Customer();
		
		//객체의 id값 비교해보기
		if(c1==c2){
			System.out.println("c1과 c2는 같아요");
		}else{
			System.out.println("c1과 c2는 달라요");
		}
		
		//c1 객체의 멤버필드에 값 대입하기
		c1.name="김구라";
		c1.age=10;
		//c2 객체의 멤버필드에 값 대입하기
		c2.name="해골";
		c2.age=20;
		
		//각각의 객체의 멤버필드에 저장된 값 출력해보기
		System.out.println("c1.name : "+c1.name);
		System.out.println("c1.age : "+c1.age);
		System.out.println("c2.name : "+c2.name);
		System.out.println("c2.age : "+c2.age);
	}
}
