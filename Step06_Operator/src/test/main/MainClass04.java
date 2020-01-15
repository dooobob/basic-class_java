package test.main;
/*
 * [ 연 산 자 ]
 * 
 * 4. 논리 연산자
 * 
 * - boolean Type 데이터를 연산해주는 연산자이다.
 * 
 * || : or 연산, 합집합의 개념, 어느 하나라도 true 이면 결과는 true
 * && : and 연산, 교집합의 개념, 모두 true 일때 결과는 true
 * ! : not 연산, boolean 값을 반전시킨다. true => false, false => true
 */
public class MainClass04 {
	//프로그램 실행순서의 시작점이되는 메인 메소드 정의하기
	public static void main(String[] args) {
		//or 연산
		boolean result1=false||false;//false
		boolean result2=false||true;//true
		boolean result3=true||false;//true
		boolean result4=true||true;//true
		
		//and 연산
		boolean result5=false&&false;//false
		boolean result6=false&&true;//false
		boolean result7=true&&false;//false
		boolean result8=true&&true;//true
		
		//not 연산
		boolean result9=!true;//false
		boolean result10=!false;//true
		
		//키가 큰지 여부
		boolean isLong=true;
		//잘생겼는지 여부
		boolean isHandsome=true;
		//재미있는지 여부
		boolean isFun=true;
		//똑똑한지 여부
		boolean isSmart=true;
		
		if(isLong&&isHandsome&&isFun&&isSmart){
			System.out.println("사귈꺼야 1");			
		}
		
		if(isLong||isHandsome||isFun||isSmart){
			System.out.println("사귈꺼야 2");
		}
		
		if(isLong&&(isHandsome||isFun||isSmart)){
			System.out.println("사귈꺼야 3");
		}
	}
}
