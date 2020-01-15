package test.mypac;
/*
 * - 멤버필드에 static final 생략가능
 * - 멤버메소드에 abstract 생략가능
 */
public interface Mp3Player {
	public String TYPE="mp3";
	
	public void playMusic();
	public void stopMusic();

}
