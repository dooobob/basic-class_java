package test.main;

import test.restaurant.Pasta;
import test.restaurant.Steak;
import test.restaurant.Vips;

public class MainClass06 {
	public static void main(String[] args) {
		//스테이크와 파스타를 각각 주문해서 먹어보세요!
		Vips order=new Vips();
		//Steak 객체의 id를 return Type으로 받아와서 변수에 담는다.
		Steak steak1=order.getSteak();
		//Pasta 객체의 id를 return Type으로 받아와서 변수에 담는다.
		Pasta pasta1=order.getPast();
		
		//각각 객체의 eat()메소드를 호출해서 먹는다.
		steak1.eat();
		pasta1.eat();
		
		order.getSteak().eat();
		order.getPast().eat();		
	}
}
