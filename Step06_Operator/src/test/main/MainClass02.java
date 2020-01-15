package test.main;
/*
 * [ 연 산 자 ]
 * 
 * 2. 증감 연산자
 * 
 * 종류 : ++, --
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num=0;
		num++;//1 증가 시키기
		System.out.println("num : "+num);
		
		int num2=0;
		num2--;//1 감소 시키기
		System.out.println("num2 : "+num2);
		
		//아래의 결과와 비교
		int num3=0;
		num3=num3+1;
		System.out.println("num3 : "+num3);
		
		int num4=0;
		num4=num4-1;
		System.out.println("num4 : "+num4);
	}
}
