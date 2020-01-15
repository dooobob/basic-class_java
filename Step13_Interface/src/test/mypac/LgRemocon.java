package test.mypac;
/*
 * Remocon 인터페이스를 구현해서 클래스를 만들어 보세요
 * 
 * 추가로 메소드도 하나 더 만들어 보세요!
 */
public class LgRemocon implements Remocon{

	public void webSurfing(){
		System.out.println("인터넷을 해요!");
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
