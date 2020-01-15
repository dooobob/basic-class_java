package test.main;
/*
 * [기본 자료형]
 * 
 * 1. 논리형(boolean)
 * 
 * - boolean  변수명
 * - 가질 수 있는 값의 범위 : true, false 두가지 값을 가질 수 있다.
 * - 만드는 방법 : true, false를 직접 써주거나,
 *   비교연산의 결과 혹은 논리연산의 결과로 얻어낼 수 있다.
 */
public class MainClass01 {
	//프로그램의 시작점이 되는 메인 메소드
	public static void main(String[] args) {
		//논리(boolean) 형 변수 선언과 동시에 값 대입하기
		boolean isRun=true;
		
		if(isRun){
			System.out.println("달려요!");			
		}
		
		//비교연산의 결과로 얻어진 boolean type 데이터를 변수에 대입하기
		boolean isGreater=10>1;
		if(isGreater){
			System.out.println("커요1");			
		}
		//변수에 있는 값을 수정하기
		isGreater=false;
		
		if(isGreater){
			System.out.println("커요2");
		}
		
		if(10>1){
			System.out.println("커요3");
		}
		
		System.out.println("메인 메소드가 return 됩니다.");
	}//main()
}//class
