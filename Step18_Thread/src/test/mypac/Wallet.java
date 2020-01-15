package test.mypac;
/*
 * 가상의 지갑 역할을 할 클래스
 */
public class Wallet {
	//돈을 static 멤버필드에 저장한다고 가정
	public static int totalMoney;
	
	//돈을 저장하는 메소드
	public static void addMoney(int money){
		totalMoney+=money;
	}
	
	//돈을 인출하는 메소드
	public static synchronized int getMoney(String name){
		if(totalMoney>0){
			totalMoney-=1;
			System.out.println(name+"가 인출! 현재 잔고 : "+totalMoney);
			return 1;
		}else{
			System.out.println(name+"가 인출요청, 더 이상 인출할 돈이 없습니다.");
			System.out.println("현재 잔고 : "+totalMoney);
			return 0;
		}
	}
}
