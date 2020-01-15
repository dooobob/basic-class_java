package test.mypac;

public class Locker {

	//멤버필드
	public int num;//사물함 번호
	public String savedMessage;//보관된 메세지
	
	//특정 메세지를 저장하는 멤버 메소드
	public void saveMessage(String msg){
		savedMessage=msg;
		System.out.println(num+"번 사물함에 메세지를 저장하였습니다.");
	}
	//저장된 메세지를 콘솔에 출력하는 멤버 메소드
	public void showMessage(){
		System.out.println(num+"번 사물함에 저장된 메세지 : "+savedMessage);
	}
}
