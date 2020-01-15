package test.mypac;

public class SamsungRemocon implements Remocon{

	//SamsungRemocon 클래스에서 추가한 멤버 메소드
	public void call(){
		System.out.println("전화를 걸어요!");
	}
	
	@Override
	public void channelUP() {
		System.out.println("채널을 올려요!");
	}

	@Override
	public void channelDOWN() {
		System.out.println("채널을 내려요!");
	}

	@Override
	public void volumnUP() {
		System.out.println("볼륨을 올려요!");
	}

	@Override
	public void volumnDOWN() {
		System.out.println("볼륨을 내려요!");
	}

}
