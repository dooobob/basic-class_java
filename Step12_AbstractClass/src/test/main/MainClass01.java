package test.main;

import test.util.MyWeapon;
import test.util.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		//단독으로 객체 생성불가
		//Weapon w1=new Weapon();
		
		Weapon w1=new MyWeapon();		
		w1.prepare();
		w1.attack();
	}
}
