package test.main;

import test.util.MyWeapon;
import test.util.OurWeapon;
import test.util.Weapon;
import test.util.YourWeapon;

public class MainClass04 {
	public static void main(String[] args) {
		//MyWeapon 객체의 id를 전달해서 메소드 호출
		useWeapon(new MyWeapon());
		//YourWeapon 객체의 id를 전달해서 메소드 호출
		useWeapon(new YourWeapon());
		//OurWeapon 객체의 id를 전달해서 메소드 호출
		useWeapon(new OurWeapon());
		
		//useWeapon(new Weapon()); //Weapon 단독으로 객체 생성 불가
	}
	
	public static void useWeapon(Weapon w){
		w.attack();
	}
}
