package test.main;
/*
 * static 멤버 메소드 내부에서는
 * 필드는 static 멤버필드 만 참조 할 수 있고
 * 메소드는 static 멤버메소드만 호출 할 수 있다.
 */
import test.util.Weapon;

public class MainClass02 {
	//일반 멤버필드
	String name1="김구라";
	//static 멤버필드
	static String name2="개구라";
	
	public static void main(String[] args) {
		//[static 멤버 메소드 내부]
		//일반 멤버메소드는 id값을 얻어내서 메소드를 호출한다
		new MainClass02().useWeapon1(null);
		//static 멤버메소드는 바로 호출 할 수 있다.
		MainClass02.useWeapon2(null);
		//System.out.println(name1);//일반 멤버필드는 참조불가
		System.out.println(name2);//static 멤버필드는 참조가능
	}
	
	public void useWeapon1(Weapon weapon){
		weapon.prepare();
		weapon.attack();
	}
	
	public static void useWeapon2(Weapon weapon){
		weapon.prepare();
		weapon.attack();
	}	
}
