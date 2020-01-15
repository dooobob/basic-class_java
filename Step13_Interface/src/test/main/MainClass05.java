package test.main;

import test.mypac.Remocon;

public class MainClass05 {
	public static void main(String[] args) {
		Remocon remocon=new Remocon(){

			@Override
			public void volumnUP() {
				System.out.println("볼륨을 올려요");
				
			}
			
			@Override
			public void volumnDOWN() {
				System.out.println("볼륨을 내려요");
				
			}
			
			@Override
			public void channelUP() {
				System.out.println("채널을 올려요");
				
			}
			
			@Override
			public void channelDOWN() {
				System.out.println("채널을 내려요");
				
			}
		};
		useRemocon(remocon);
		useRemocon(new Remocon() {
			
			@Override
			public void volumnUP() {
				System.out.println("볼륨을 올려요");
				
			}
			
			@Override
			public void volumnDOWN() {
				System.out.println("볼륨을 내려요");
				
			}
			
			@Override
			public void channelUP() {
				System.out.println("채널을 올려요");
				
			}
			
			@Override
			public void channelDOWN() {
				System.out.println("채널을 내려요");
			}
			
		});
	}
	
	public static void useRemocon(Remocon r){
		r.channelUP();
		r.channelDOWN();
	}	
}