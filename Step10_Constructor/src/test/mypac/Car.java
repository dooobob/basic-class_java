package test.mypac;

public class Car {
	//멤버필드 정의하기
	private Engine engine;
	
	//생성자 정의하기
	public Car(Engine engine){
		//생성자의 인자로 Engine객체의 id값을 받아서 멤버 필드에 저장한다.
		this.engine=engine;
	}
	
	//멤버 메소드 정의하기
	public void drive(){
		if(engine==null){
			System.out.println("Engine 객체가 없어서 달릴수가 없어요");
			return;//메소드 종료
		}
		System.out.println(engine.companay+"엔진으로 부릉부릉 달려요!");
	}

}
