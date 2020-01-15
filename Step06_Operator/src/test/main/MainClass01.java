package test.main;
/*
 * [ 연 산 자 ]
 * 
 * 1. 산술 연산자
 * 
 * 종류 : +, -, *, /, %
 */
public class MainClass01 {
	public static void main(String[] args) {
		//int Type 지역변수에 값 대입하기
		int num1=5;
		int num2=2;
		
		//두 수의 합을 구해서 sum이라는 int Type 변수에 담기
		int sum=num1+num2;
		System.out.println("sum : "+sum);
		
		//두 수의 곱을 구해서 multiply라는 int Type 변수에 담기
		int multiply = num1*num2;
		System.out.println("multiply : "+multiply);
		
		int divide=num1/num2;
		System.out.println("num1을 num2로 나눈 몫 : "+divide);
		/*
		 * int type과 int type을 연산하면 결과는 int type만 나오기 때문에
		 * 연산에 참여하는 데이터중 하나를 double type으로 casting 해여 연산을 해서
		 * 결과를 double type으로 얻어낼 수 있다.
		 */
		double divide2=num1/(double)num2;
		System.out.println("num1을 num2로 나눈 값 : "+divide2);
		
		double divide3=num1/2.0;
		System.out.println("divide3 : "+divide3);
		
		//num1을 num2로 나눈 나머지를 변수에 담기
		int result=num1%num2;
		System.out.println("num1을 num2로 나눈 나머지 : "+result);
	}
}
