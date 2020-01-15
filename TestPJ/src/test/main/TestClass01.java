package test.main;

import test.pac.HandPhone;
import test.pac.Phone;
import test.pac.SmartPhone;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		 * SmartPhone 객체의 아이디를 다양한 Type 변수에 담아보기
		 * 
		 * - 다형성(Polymorphism) 확인!
		 */
		//Object phone1=new SmartPhone();
		//Phone phone2=new SmartPhone();
		//HandPhone phone3=new SmartPhone();
		SmartPhone phone4=new SmartPhone();	
		/*
		//casting 연산자를 이용해서 phone Type 으로 바꾼다음 바로 메소드 호출!
		((Phone)phone1).call();
		
		//casting 연산자를 이용해서 Phone Type 변수에 id를 담아 놓고
		Phone phone5=(Phone)phone1;
		//변수에 있는 id를 이용해서 메소드 호출!
		phone5.call();
		
		if(phone1==phone5){
			System.out.println("phone1과 phone5는 같아요");
		}else{
			System.out.println("pheon1과 phone5는 달라요");
		}*/
	}
}
