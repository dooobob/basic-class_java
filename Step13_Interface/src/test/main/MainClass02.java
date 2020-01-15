package test.main;

import test.mypac.LgRemocon;
import test.mypac.Remocon;
import test.mypac.SamsungRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		//useRemcon() 메소드를 호출 해보세요
		useRemocon(new SamsungRemocon());
		useRemocon(new LgRemocon());
	}
	
	public static void useRemocon(Remocon r){
		System.out.println("----- 리모컨 사용중 -----");
		r.channelUP();
		r.channelDOWN();
		r.volumnUP();
		r.volumnDOWN();
	}
}
