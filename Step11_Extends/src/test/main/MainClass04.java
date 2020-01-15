package test.main;

import test.auto.Bus;
import test.auto.Car;
import test.auto.Engine;
import test.auto.Taxi;

public class MainClass04 {
	public static void main(String[] args) {
		//Taxi 객체를 생성해서 id를 Car Type변수에 담기
		Car car1=new Taxi(new Engine());
		//Bus 객체를 생성해서 id를 Bus Type변수에 담기
		Car car2=new Bus(new Engine());
		
		//Taxi Type 으로 casting
		Taxi car3=(Taxi)car1;
		car3.startEngine();//시동을 켠다
		car3.drive();//달린다
		System.out.println("--------------------");
		//Bus Type 으로 casting
		Bus car4=(Bus)car2;
		car4.startEngine();//시동을 켠다
		car4.drive();//달린다
		System.out.println("--------------------");
		//엔진을 끄면 달릴 수 없다.
		car4.stopEngine();//시동을 끈다
		car4.drive();
	}
}
