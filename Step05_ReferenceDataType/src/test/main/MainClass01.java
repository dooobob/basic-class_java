package test.main;
/*
 * [ 참조 데이터형 (레퍼런스형, 객체형) ]
 * 
 * String
 * 
 * - String 변수명;
 * - String Type 객체의 id값(주소값, 참조값, 레퍼런스값)을 저장 할 수있다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//String Type 변수 선언과 동시에 값 대입하기
		String str="HBI 기술연구소 학원";
		
		//메소드 안에서 변수를 선언만 한다면?
		String name1;//선엄만 하면 만들어 지지 않는다.
		
		//메소드 안에서 변수를 선언해서 null을 대입한다면?
		//null : id값이 담기지 않은 빈(empty) 상태로 생각하면 된다.
		String name2=null;
		//name2.length(); NullPointerException 이 발생한다.
		
		String name3="김구라";
		int length=name3.length();
		System.out.println("name3.length() : "+length);
	}
}
