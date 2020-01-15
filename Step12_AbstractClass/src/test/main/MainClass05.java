package test.main;

import test.util.Weapon;

public class MainClass05 {
	//Weapon 추상 클래스를 상속받은 TestWeapon이라는 클래스 정의하기
	static class TestWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("공격해요!");
		}		
	}
	/*
	 * 익명의 Inner Class를 이용해서 Weapon 추상클래스 Type id 얻어내기
	 */	
	static Weapon weapon=new Weapon() {
		
		@Override
		public void attack() {
			System.out.println("공격해요!");
		}
	};
	
	public static void main(String[] args) {
		//Inner Class를 이용해서 Weapon Type id를 얻어내서 메소드 호출
		useWeapon(new TestWeapon());
		
		useWeapon(weapon);
	}
	
	public static void useWeapon(Weapon w){
		w.prepare();
		w.attack();
	}
}
