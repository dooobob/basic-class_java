package test.mypac;

public class Customer {
	//Member Field(data의 저장소)
	public String name="김경태";//이름
	public int age=20;//나이
	
	//물건을 고르는 동작 (Member Method)
	public void choose(){
		System.out.println("물건을 골라요!");		
	}
	
	//돈을 내는 동작
	public void pay(){
		System.out.println("돈을 지불해요!");
	}
}
