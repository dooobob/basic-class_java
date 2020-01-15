package test.main;

import test.util.Weapon;

public class MainClass06 {
	
	public static void main(String[] args) {
		//TestWeapon 이라는 이름의 Local Inner Class 정의하기
		class TestWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("공격해요!");
			}
			
		}
		useWeapon(new TestWeapon());
		//익명의 Local Inner Class를 이용해서 Weapon Type 참조값 얻기
		Weapon weapon=new Weapon(){

			@Override
			public void attack() {
				System.out.println("공격해요!");
			}
		};		
		useWeapon(weapon);
		
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("공격해요!");
			}
		});
	}
	
	public static void useWeapon(Weapon w){
		w.prepare();
		w.attack();
	}
}
