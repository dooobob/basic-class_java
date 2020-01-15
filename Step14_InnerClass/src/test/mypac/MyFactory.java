package test.mypac;

public class MyFactory {
	//일반 inner class
	public class Phone{
		//전화를 거는 메소드
		public void call(){
			System.out.println("전화를 걸어요");
		}
	}
	
	public void doSomething(){
		new Phone().call();
	}
	
	public Phone getPhone(){
		return new Phone();
	}
}
