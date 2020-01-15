package test.mypac;
/*
 * 가상의 계산기 객체를 생성할 클래스 정의하기
 */
public class Calculator {
	//멤버필드
	private int batteryPower=100;
	
	//두 수를 더해서 결과값을 출력해주는 메소드
	public void showPlus(int x,int y){
		if(batteryPower<=0){
			System.out.println("배터리가 없어서 계산이 안되요!");
			return;//메소드 강제로 리턴시키기
		}
		//전달받은 두 정수의 합을 구한다.
		int result=x+y;
		//출력해보기
		System.out.println(result);
		//배터리 파워 20씩 줄이기
		batteryPower-=20;
	}
	
	//두 수를 더해서 결과값을 리턴해주는 메소드
	public int getPlus(int x, int y){
		if(batteryPower<=0){
			System.out.println("배터리가 없어서 계산이 안되요!");
			return 0;//메소드 강제로 리턴시키기
		}
		//전달받은 두 정수의 합을 구한다.
		int result=x+y;
		batteryPower-=20;
		//결과값을 메소드를 호출한 위치로 돌려준다.
		return result;
	}
}
