package test.mypac;
/*
 * [ Thread 작업단위 만들기 ]
 * 
 * (방법2)
 * 
 * - Runnable 인터페이스를 구현한 클래스를 정의한다.
 * - run()메소드를 오버드라이드 한다.
 * - 스레드가 필요한 곳에서 지금만든 클래스로 Runnable Type객체를 생성한다.
 * - Thread 객체를 생성하면서 생성자의 인자로 Runnable Type id를 전달한다.
 * - 생성한 Thread 객체의 start()메소드를 호출해서 새로운 스레드를 시작 시킨다. 
 */
public class SubWorker3 implements Runnable{
	private String name;
	private int count;
	//생성자
	public SubWorker3(String name, int count){
		this.name=name;
		this.count=count;
	}
	@Override
	public void run() {
		System.out.println(name+" Thread 시작!");
		//멤버필드에 저장된 count 만큼 반복잡업하는 부분
		for(int i=0;i<count;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread Name : "+name+"가 "+i+"번째 작업중");
		}
		System.out.println(name+" Thread 종료!");
	}

}
