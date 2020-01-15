package test.main;

import test.mypac.Calculator;

public class MainClass08 {
	public static void main(String[] args) {
		Calculator cal1=new Calculator();
		Calculator cal2=new Calculator();
		
		cal1.showPlus(10, 10);
		cal1.showPlus(10, 10);
		cal1.showPlus(10, 10);
		cal1.showPlus(10, 10);
		cal1.showPlus(10, 10);
		cal1.showPlus(10, 10);		
		cal1.showPlus(10, 10);
		
		System.out.println("------------");
		cal2.showPlus(20, 20);
	}
}
