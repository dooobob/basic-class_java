package test.main;

import test.mypac.SubWorker;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		new SubWorker().start();
		new SubWorker().start();
		new SubWorker().start();
		new SubWorker().start();
		new SubWorker().start();
		
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}
