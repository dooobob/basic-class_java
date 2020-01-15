package test.main;

import test.util.YourUtil;

public class MainClass11 {
	public static void main(String[] args) {
		YourUtil util1=new YourUtil();
		YourUtil util2=new YourUtil();
		YourUtil util3=new YourUtil();
		
		util1.make();
		
		util2.make();
		util2.make();
		
		util3.make();
		util3.make();
		util3.make();
		
		System.out.println("--- util1 ---");
		util1.showInfo();
		
		System.out.println("--- util2 ---");
		util2.showInfo();
		
		System.out.println("--- util3 ---");
		util3.showInfo();
	}
}
