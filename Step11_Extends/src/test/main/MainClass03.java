package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass03 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서
		SmartPhone phone1=new SmartPhone();
		//SmartPhone 클래스에서 재 정의한 takePicture() 메소드 호출해보기
		phone1.takePicture();//몇 화소의 사진이 찍히는지 확인!
		
		/*
		 * 최초 생성한 객체를 check한다.
		 * 
		 * phone2의 객체를 찾아가면 takePicture() 메소드가 재 정의 되지 않았다
		 * phone3의 객체를 찾아가면 takePicture() 메소드가 재 정의 되었다.
		 */
		Object phone2=new HandPhone();
		Object phone3=new SmartPhone();
		
		HandPhone phone4=(HandPhone)phone2;
		phone4.takePicture();//몇 화소의 사진이 찍히는지 확인
		
		HandPhone phone5=(HandPhone)phone3;
		phone5.takePicture();//몇 화소의 사진이 찍히는지 확인
	}
}
