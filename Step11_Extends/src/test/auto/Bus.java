package test.auto;
/*
 * 자식클래스의 생성자에서 부모 클래스의 생성자에 값을 전달하는 문법 익히기
 */
public class Bus extends Car{
	//부모 클래스의 생성자에서 필요한 값을 전달 받는 생성자
	public Bus(Engine engine){
		//부모 생성자에 값을 전달해준다.
		//단, 가장 먼저 해주어야한다.
		super(engine);//super() => 부모클래스의 생성자를 의미한다.
	}
	//달리는 메소드
	public void drive(){
		if(engine.isStarted()==false){
			System.out.println("시동을 먼저 켜주세요");
			return;
		}
		System.out.println("Bus가 달려요!");
	}
}
