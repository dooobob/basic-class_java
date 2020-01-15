package test.mypac;
/*
 * [ Thread 작업단위 만들기 ]
 * 
 * (방법1)
 * 
 * 1. Thread 클래스를 상속받은 클래스를 정의한다.
 * 2. run()메소드를 오버라이드 한다.
 * 3. 새로운 Thread가 필요한 곳에서 만든 클래스를 이용해서 객체를 생성하고
 * 	  start() 메소드를 호출한다.
 */
public class SubWorker extends Thread{
	@Override
	public void run() {
		System.out.println("새로운 Thread 시작");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("새로운 Thread 종료");
	}
}
