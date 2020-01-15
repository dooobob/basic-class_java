package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		String strNum="10";
		
		int num=Integer.parseInt(strNum);
		
		String result1=strNum+10;
		int result2=num+10;
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
		//doubleNum 변수에 들어있는 값을 이용해서
		//double Type 10.1을 만들어 보세요
		String doubleNum="10.1";
		double dNum=Double.parseDouble(doubleNum);
		
		String strBoolean="true";
		boolean isTrue=Boolean.parseBoolean(strBoolean);
	}
}
