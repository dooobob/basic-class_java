package test.mypac;

public class OurFactory {
	//일반 멤버메소드
	public void makeSomething(){
		//Local Inner Class
		class Car{
			public void drive(){
				System.out.println("달려요");
			}
		}
		Car car=new Car();
		car.drive();
		System.out.println("Car 객체를 만들어서 탔습니다.");
	}
	
	//static 멤버 메소드
	public static void makeSomething2(){
		//Local Inner Class
		class Car{
			public void drive(){
				System.out.println("달려요");
			}
		}
		Car car=new Car();
		car.drive();
		System.out.println("Car 객체를 만들어서 탔습니다.");
	}
}
