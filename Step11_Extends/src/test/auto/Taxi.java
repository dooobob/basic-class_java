package test.auto;
/*
 * class 예약어 앞에 final 예약어를 추가하면 종단 클래스가 된다.
 * 종단 클래스 : 더 이상 상속을 허용하지 않는 클래스
 */
public final class Taxi extends Car{
	
	public Taxi(Engine engine){
		super(engine);
	}
	
	//달리는 메소드
	public void drive(){
		if(engine.isStarted()==false){
			System.out.println("시동을 먼저 켜주세요");
			return;
		}
		System.out.println("Taxi가 달려요!");
	}

}
