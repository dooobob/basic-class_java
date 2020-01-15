package test.main;

public class MainClass03 {
	public static void main(String[] args){
		int num=0;
		num=10;
		System.out.println("num : "+num);
		
		double num2=0.0;
		num2=10.1;
		System.out.println("num2 : "+num2);
		
		String name=null; //null : 어떤 객체의 주소값도 들어있지 않은 빈 상태
		name="김경태";
		System.out.println("name : "+name);
		System.out.println("name.length() : "+name.length());
		//name에 들어있는 참조값을 name2에 복사해주기
		String name2=name;
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
