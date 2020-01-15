package test.main;

import test.mypac.Locker;

public class MainClass04 {
	public static void main(String[] args) {
		//Locker 객체 생성하기
		Locker loc1=new Locker();
		//사물함 번호 지정하기
		loc1.num=1;
		//메소드를 이용해서 메세지 저장하기
		loc1.saveMessage("동쪽으로 가면 귀인을 만나요!");
		
		//메소드를 이용해서 저장된 메세지 출력해보기
		loc1.showMessage();	
	}
}
