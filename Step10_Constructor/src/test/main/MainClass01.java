package test.main;

import test.mypac.Gun;

public class MainClass01 {
	public static void main(String[] args) {
		//디폴트 생성자를 호출해서 객체 생성
		Gun gun1=new Gun();
		gun1.showInfo();
		gun1.fire();
		System.out.println("---------------------");
		//int Type을 전달 받는 생성자를 호출해서 객체 생성
		Gun gun2=new Gun(10);
		gun2.showInfo();
		gun2.fire();
		System.out.println("---------------------");
		//String Type을 전달 받는 생성자를 호출해서 객체 생성
		Gun gun3=new Gun("a-11");
		gun3.showInfo();
		gun3.fire();
		System.out.println("---------------------");
		//int Type과 String Type을 전달 받는 생성자를 호출해서 객체 생성
		Gun gun4=new Gun(20,"a-12");
		gun4.showInfo();
		gun4.fire();
	}
}
