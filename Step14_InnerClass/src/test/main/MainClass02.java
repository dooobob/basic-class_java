package test.main;

import test.mypac.YourFactory;

public class MainClass02 {
	public static void main(String[] args) {
		//특정 클래스의 inner 클래스 안에 정의된 static 멤버 메소드 호출
		YourFactory.Ramen.eat();
		
		//일반 멤버 메소드를 호출해서 inner class Type id얻어오기
		YourFactory.Ramen r=new YourFactory().getRamen();
	}
}
