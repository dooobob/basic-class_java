package test.main;

import test.util.MyWeapon;
import test.util.Weapon;

public class MainClass03 {
	public static void main(String[] args) {
		MyWeapon w1=new MyWeapon();
		useWeapon(w1);
		
		Weapon w2=new MyWeapon();
		useWeapon(w2);
		
		useWeapon(new MyWeapon());
	}
	
	//추상 클래스 Type의 id를 인자로 전달받아서 사용하는 메소드
	public static void useWeapon(Weapon weapon){
		weapon.prepare();
		weapon.attack();
	}
}
