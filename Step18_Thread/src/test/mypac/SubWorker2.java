package test.mypac;

public class SubWorker2 extends Thread{
	//생성자로 부터 전달 받은 값을 저장할 멤버필드
	private String name;
	private int count;
	
	//생성자
	public SubWorker2(String name, int count){
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
