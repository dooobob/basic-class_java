package test.main;
/*
 * [ 연 산 자 ]
 * 
 * 5. 대입 연산자
 * 
 * 종류 : =, +=, *=, /=, %=
 */
public class MainClass05 {
	public static void main(String[] args) {
		int num=10;
		
		num=num+2;
		//위의 표현식을 줄여서 다음과 같이 표현할 수 있다.
		num+=2;
		
		num=num-3;
		//위의 표현식을 줄이면?
		num-=3;
		
		num=num*4;
		//위의 표현식을 줄이면?
		num*=4;
		
		num=num/4;
		//위의 표현식을 줄이면?
		num/=4;
		
		num=num%5;
		//위의 표현식을 줄이면
		num%=5;
	}
}
