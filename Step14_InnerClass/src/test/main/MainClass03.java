package test.main;

import test.mypac.OurFactory;

public class MainClass03 {
	public static void main(String[] args) {
		//id값을 이용해서 메소드 호출해보기
		new OurFactory().makeSomething();
		
		//클래스명을 이용해서 메소디 호출해보기
		OurFactory.makeSomething2();
	}
}
