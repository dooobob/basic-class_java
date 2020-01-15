package test.mypac;

public class Gun {
	//멤버 필드
	private String modelNumber;//모델번호
	private int bulletNumber;//총알의 갯수
	
	//디폴트 생성자 명시적으로 정의하기
	public Gun(){
		//객체가 생성되는 시점에 초기화 작업이 필요하다면 여기서 해준다.
		System.out.println("Gun() 생성자가 호출됨!");
	}
	
	//생성자의 인자로 총알의 갯수를 전달 받는 생성자
	public Gun(int bulletNumber){
		this.bulletNumber=bulletNumber;
	}
	
	//생성자의 인자로 모델번호를 전달 받는 생성자
	public Gun(String modelNumber){
		this.modelNumber=modelNumber;
	}
	
	//생성자의 인자로 총알의 갯수와 모델번호를 전달받은 생성자
	public Gun(int bulletNumber, String modelNumber){
		this.bulletNumber=bulletNumber;
		this.modelNumber=modelNumber;
	}
	
	//총알을 발사하는 메소드
	public void fire(){
		if(bulletNumber==0){
			System.out.println("총알이 없어요!");
			return;//메소드 종료
		}
		System.out.println("빵!");
	}
	
	public void showInfo(){
		System.out.println("모델번호 : "+modelNumber);
		System.out.println("총알갯수 : "+bulletNumber);
	}
}
