package test.mypac;
/*
 * 클래스는 단일 상속만 가능하지만
 * 인터페이스는 다중 상속이 가능하다.
 */
public class HbiRemocon implements Remocon,Mp3Player{

	@Override
	public void playMusic() {
		System.out.println("음악을 재생해요");
	}

	@Override
	public void stopMusic() {
		System.out.println("음악을 정지해요");
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
