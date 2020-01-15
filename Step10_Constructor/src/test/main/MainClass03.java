package test.main;

import test.mypac.Car;
import test.mypac.Engine;

public class MainClass03 {
	public static void main(String[] args) {
		Car car1=new Car(new Engine("Hyundai"));
		Car car2=new Car(new Engine("BMW"));
		Car car3=new Car(new Engine("Toyota"));
		Car car4=new Car(new Engine());
		
		car1.drive();
		car2.drive();
		car3.drive();
		car4.drive();
	}
}
