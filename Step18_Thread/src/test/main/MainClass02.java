package test.main;

import test.mypac.SubWorker2;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인메소드(메인 스레드)가 시작 되었습니다.");
		//새로운 스레드를 시작 시킬 스레드 객체를 생성해서 참조값을 변수에 담는다.
		SubWorker2 work1=new SubWorker2("a",5);
		SubWorker2 work2=new SubWorker2("b",10);
		SubWorker2 work3=new SubWorker2("c",20);
		
		work1.start();
		work2.start();
		work3.start();
		
		System.out.println("메인 스레드가 종료됩니다.");
	}
}
