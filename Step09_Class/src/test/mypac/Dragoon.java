package test.mypac;

public class Dragoon {
	//멤버필드
	public int energy=100;//에너지
	public boolean isDead=false;//죽었는지 여부
	
	//움직이는 멤버메소드
	public void move(){
		if(isDead)return;
		System.out.println("움직여요!");
	}
	//공격하는 멤버메소드
	public void attack(){
		if(isDead)return;
		System.out.println("공격해요!");
	}
	//공격을 받아서 에너지를 줄이는 메소드
	public void damage(){
		if(isDead)return;
		energy-=20;
		System.out.println("아.. 아프다. 에너지 20 줄었네");
		if(energy<0){
			isDead=true;
			System.out.println("죽었네 꾁!");
		}
	}
}
