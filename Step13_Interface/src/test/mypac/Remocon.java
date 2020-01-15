package test.mypac;
/*
 * [ 인터페이스 ]
 * 
 * - 생성자가 없다(단독 객체 생성 불가)
 * - 구현된 멤버 메소드를 가질 수 없다(추상메소드만 가질 수 있다)
 * - 멤버필드는 static final 상수만 가질 수 있다
 * - Data Type의 역할을 할 수 있다.
 * - 인터페이스 Type의 id가 필요하다면 implements 예약어를 이용해서
 * 	 특정 클래스가 인터페이스를 구현하게 한 다음 해당 클래스의 생성자를
 * 	 호출해서 인터페이스 Type의 id를 얻어낸다.
 * - 인터페이스는 다중 구현이 가능하다.
 */

public interface Remocon {
	//멤버필드 정의하기
	public static final String TYPE="CABLE TV";
	
	//멤버 메소드 정의하기
	public abstract void channelUP();
	public abstract void channelDOWN();
	public abstract void volumnUP();
	public abstract void volumnDOWN();
}
