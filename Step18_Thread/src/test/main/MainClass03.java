package test.main;

import test.mypac.SubWorker3;

public class MainClass03 {
	public static void main(String[] args) {
		//Runnable Type 객체를 생성한다.
		Runnable run1=new SubWorker3("A", 10);
		//Thread 객체를 생성하면서 Runnable Type id를 생성자의 인자로 전달한다.
		Thread tread1=new Thread(run1);
		tread1.start();
		
		//익명의 Local InnerClass를 이용해서 Runnable 인터페이스 Type id 얻어내기
		Runnable run2=new Runnable() {			
			@Override
			public void run() {
				System.out.println("무언가 작업해요!");				
			}
		};
		new Thread(run2).start();
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				System.out.println("작업! 작업!");				
			}
		}).start();
		System.out.println("메인 메소드(메인 스레드)가 종료 됩니다.");
	}
}
