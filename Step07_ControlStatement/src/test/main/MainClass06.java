package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		//final 예약어를 이용해서 정수값에 의미있는 이름을 부여한다.
		final int WEAPON_FIST=0;
		final int WEAPON_SWORD=1;
		final int WEAPON_GUN=2;
		
		//현재 선택된 무기의 상태값을 저장 할 변수
		int weaponType=WEAPON_SWORD;
		
		if(weaponType==WEAPON_FIST){
			System.out.println("주먹으로 공격!");
		}else if(weaponType==WEAPON_SWORD){
			System.out.println("칼로 공격!");
		}else if(weaponType==WEAPON_GUN){
			System.out.println("총으로 공격!");
		}else{
			System.out.println("공격할 무기가 없습니다.");
		}
		
		switch(weaponType){
			case 0:
				System.out.println("주먹으로 공격!");
				break;
			case 1:
				System.out.println("칼로 공격!");
				break;
			case 2:
				System.out.println("총으로 공격!");
				break;
			default:
				System.out.println("공격할 무기가 없습니다.");				
		}
		
		
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
