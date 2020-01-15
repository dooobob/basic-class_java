package test.main;
/*
 *  3. 실수형
 *  
 *  - float 변수명; // f40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 *  
 *  표현 가능 범위가 다르다
 *  float < double 
 */
public class MainClass03 {
	public static void main(String[] args) {
		//실수형 변수 선언과 동시에 값 대입하기
		float iFloat=10.1f;
		double iDouble=10.2d;
		//double Type 데이터를 만들어 낼 때 d 는 생략 가능
		double iDouble2=10.3;//10.3d를 줄여서 10.3이라고 표현
		
		//값을 이용해서 산술 연산하기
		double result1=10.1f+10.9d;
		//변수에 있는 값을 이용해서 산술연산하기
		double result2=iFloat+iDouble;
		//연산 후 결과를 casting 해서 변수에 담기
		float result3=(float)(iFloat+iDouble);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
	}
}
