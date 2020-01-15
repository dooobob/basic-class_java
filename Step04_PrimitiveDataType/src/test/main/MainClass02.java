package test.main;
/*
 *  2. 정수형
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2147483648 ~ 2147483647
 *  - long 변수명; // -9223372036854775808 ~ 9223372036854775807
 *  
 *  표현 가능한 정수의 범위가 다르다.
 *  
 *  byte < short < int < long
 */
public class MainClass02 {
	public static void main(String[] args) {
		//정수형 변수 선언과 동시에 값 대입하기
		byte iByte=10;
		short iShort=10;
		int iInt=10;
		long iLong=100000;
		//up casting : 자동으로 이루어진다.
		iInt=iByte;
		
		//down casting : 명시적으로 해야한다.
		iShort=(short)iLong; //(short) => casting 연산자
		
		System.out.println("iShort : "+iShort);
		
	}
}
