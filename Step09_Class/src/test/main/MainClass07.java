package test.main;

import test.mypac.Calculator;

public class MainClass07 {
	public static void main(String[] args) {
		//Calculator 객체 생성해서 id값을 변수에 담기
		Calculator cal=new Calculator();
		//showPuls)메소드 호출
		cal.showPlus(2,2);
		System.out.println("---------------");
		//getPlus()메소드를 호출해서 return 되는 data를 변수에 담기
		int result=cal.getPlus(1, 2);
		//변수에 담긴 데이터 사용해보기
		System.out.println("result : "+result);
	}
}
