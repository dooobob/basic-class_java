package test.main;

import test.mypac.Car;
import test.mypac.Engine;

public class MainClass02 {
	public static void main(String[] args) {
		//디폴트 생성자를 이용해서 Car 객체가 생성이 될까요?
		//new Car();	//디폴트 생성자가 존재하지 않으므로 객체 생성 불가
		
		//Car객체를 생성해서 id값을 변수에 담아 보세요!		
		Car car1=new Car(new Engine());
		
		//방법2.
		Engine e=new Engine();
		Car car2=new Car(e);
		
		//방법3.
		Car car3=new Car(null);
		
		car1.drive();
		car2.drive();
		car3.drive();
	}
}
