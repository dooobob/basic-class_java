package test.main;

import test.mypac.HbiRemocon;
import test.mypac.LgRemocon;
import test.mypac.Mp3Player;
import test.mypac.Remocon;
import test.mypac.SamsungRemocon;

public class MainClass03 {
	public static void main(String[] args) {		
		tvOperation(new SamsungRemocon());
		tvOperation(new LgRemocon());
		tvOperation(new HbiRemocon());
		//Mp3Player 인터페이스를 구현하지 않은 객체이므로 메소드 호출 불가
		//musicOperation(new SamsungRemocon());
		//musicOperation(new LgRemocon());
		//HbiRemocon 클래스는 Mp3Player인터페이스를 구현 했으므로 호출 가능
		musicOperation(new HbiRemocon());
		
		//HbiRemocon 객체의 다양한 Type 확인해보기
		HbiRemocon r1=new HbiRemocon();
		Remocon r2=r1;
		Mp3Player r3=r1;
		Object r4=r1;
	}
	
	public static void tvOperation(Remocon r){
		System.out.println("-----리모컨 사용중1-----");
		r.channelUP();
		r.channelDOWN();
		r.volumnUP();
		r.volumnDOWN();
	}
	
	public static void musicOperation(Mp3Player p){
		System.out.println("-----리모컨 사용중2-----");
		p.playMusic();
		p.stopMusic();
	}
}
