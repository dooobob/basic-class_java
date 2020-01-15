package test.main;
/*
 * 4. 문자형
 * 
 * - char변수명;
 * - 총 65536 가지의 코드값을 가질 수 있어서 해당 수 만큼 문자 1글자를 표현 할 수있다
 * - 범위 : 0~65535
 */
public class MainClass04 {
	public static void main(String[] args) {
		//char형 변수 선언과 동시에 값 대입하기
		char ch1='a';
		char ch2='A';
		char ch3='가';
		char ch4='쀍';
		
		int code1=ch1;
		int code2=ch2;
		int code3=ch3;
		int code4=ch4;
		
		System.out.println(ch1+"/"+ch2+"/"+ch3+"/"+ch4);//char+string => string
		System.out.println(code1+"/"+code2+"/"+code3+"/"+code4);
		
		char ch5=1000;
		System.out.println(ch5);
	}
}
