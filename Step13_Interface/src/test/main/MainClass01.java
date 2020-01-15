package test.main;

import test.mypac.Remocon;
import test.mypac.SamsungRemocon;

public class MainClass01 {
	public static void main(String[] args) {
		Object a=new SamsungRemocon();
		SamsungRemocon b=new SamsungRemocon();
		//인터페이스를 구현한 클래스를 이용해서 Remocon Type id 얻어내기
		Remocon c=new SamsungRemocon();
		//Remocon Type의 멤버 메소드 사용해보기
		c.channelUP();
		c.channelDOWN();
		c.volumnUP();
		c.volumnDOWN();
		//c에 있는 id값을 casting해서 d에 대입한다.
		SamsungRemocon d=(SamsungRemocon)c;
		d.call();
		((SamsungRemocon)c).call();
		
		if(c==d){
			System.out.println("c에 있는 id와 d에 있는 id는 같아요!");
		}
		
		//인터페이스에 정의된 static final 멤버필드 참조 해보기
		System.out.println(Remocon.TYPE);
	}

}
