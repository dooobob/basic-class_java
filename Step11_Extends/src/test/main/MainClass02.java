package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * Phone, HandPhone, SmartPhone 객체를 각각 생성해서 부모 Type인
		 * Object Type 변수에 담아보기
		 * 
		 * - 최초 생성한 객체를 check 해야한다.
		 */
		Object phone1=new Phone();
		Object phone2=new HandPhone();
		Object phone3=new SmartPhone();
		
		//casting 불가(Exception이 발생한다)
		//HandPhone phone4=(HandPhone)phone1;
		
		//원래 HandPhone 객체이므로 casting 가능하다
		HandPhone phone5=(HandPhone)phone2;
		phone5.call();//당연히 HandPhone에 정의된 메소드 사용가능
		
		//casting 불가(Exception이 발생한다)
		//SmartPhone phone6=(SmartPhone)phone2;
		
		//원래 SmartPhone 객체이므로 casting 가능하다
		SmartPhone phone6=(SmartPhone)phone3;
		phone6.doInternet();//당연히 SmartPhone 에 정의된 메소드 사용가능
	}
}
