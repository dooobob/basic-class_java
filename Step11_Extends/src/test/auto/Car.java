package test.auto;

public class Car {
	//멤버필드 정의하기
	protected Engine engine;
	
	//생성자의 인자로 Engine Type id를 전달받는 생성자
	public Car(Engine engine){
		//인자로 전달받은 값을 멤버필드에 저장하기
		this.engine=engine;
	}
	
	//시동을 거는 메소드
	public void startEngine(){
		engine.setStarted(true);
		System.out.println("부릉부릉~");
	}
	public void stopEngine(){
		engine.setStarted(false);
		System.out.println("시동이 꺼집니다.");
	}
}
