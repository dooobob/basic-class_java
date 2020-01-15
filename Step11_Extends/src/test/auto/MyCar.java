package test.auto;

public class MyCar extends Taxi{//Taxi 는 종단 클래스 이므로 상속 받을 수 없다.
	public MyCar(Engine engine){
		super(engine);
	}
}
