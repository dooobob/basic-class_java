package test.main;

import test.mypac.Wallet;

public class MainClass04 {
	public static void main(String[] args) {
		
		Runnable run1=new Runnable() {
			
			@Override
			public void run() {
				//인출한 돈을 저장 할 지역변수
				int totalMoney=0;
				//반복문 돌면서 Wallet에서 돈을 인출한다.
				while(true){
					int money=Wallet.getMoney("김구라");
					//잔고가 없다면 반복문 빠져 나온다.
					if(money==0) break;
					//인출한 돈을 변수에 누적시킨다.
					totalMoney+=money;
				}
				System.out.println("김구라가 총 인출 한 돈 : "+totalMoney);
			}
		};
		
		Runnable run2=new Runnable() {
			
			@Override
			public void run() {
				//인출한 돈을 저장 할 지역변수
				int totalMoney=0;
				//반복문 돌면서 Wallet에서 돈을 인출한다.
				while(true){
					int money=Wallet.getMoney("원숭이");
					//잔고가 없다면 반복문 빠져 나온다.
					if(money==0) break;
					//인출한 돈을 변수에 누적시킨다.
					totalMoney+=money;
				}
				System.out.println("원숭이가 총 인출 한 돈 : "+totalMoney);
			}
		};
		
		//지갑에 돈을 세팅하고
		Wallet.addMoney(100000);
		//스레드를 시작 시킨다.
		new Thread(run1).start();
		new Thread(run2).start();
	}
}
