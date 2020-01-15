package test.main;
/*
 * [ 상수 만들기 ]
 * 
 * - Type 앞에 final 이라는 예약어를 붙여서 선언한다.
 * - 한번 만들어진 상수는 값 수정 불가
 * - 상수명은 관례상 모두 대문자로 표기한다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		final String MY_NAME="김구라";
		System.out.println(MY_NAME);
		
		//반지름이 10인 원의 넓이를 구한다면?
		final double PI=3.141592;
		double area=10*10*PI;
		System.out.println("반지름이 10인원의 넓이 : "+area);
		
		final String GREETING_KOR="안녕하세요!";
		final String GREETING_JPN="곤니찌와!";
		final String GREETING_CHN="니 하오!";
		final String GREETING_ENG="하이!";
		
		System.out.println("중국어 인삿말 : "+GREETING_CHN);
	}
}
