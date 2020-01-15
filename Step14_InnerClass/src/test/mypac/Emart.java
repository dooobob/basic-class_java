package test.mypac;

public class Emart {
	//멤버필드
	private Mike mike;
	//생성자
	public Emart(Mike mike){
		this.mike=mike;
	}
	
	public void saySomething(String msg){
		mike.broadcast(msg);
	}
	/*
	 * Inner Class 안에서 외부 클래스에 있는 멤버필드, 멤버메소드는
	 * 자유롭게 참조하거나 사용할 수 있다.
	 */
	public class Assistant{
		public void say(){
			//외부 클래스 멤버필드 참조
			mike.broadcast("Assistant가 말합니다.");
			//외부 클래스 멤버메소드 사용
			saySomething("Assistant가 말합니다.");
		}
	}
}
