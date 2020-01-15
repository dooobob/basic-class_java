package test.main;

import java.util.ArrayList;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1. Car 객체를 3개 생성해서 id 값을 ArrayList 객체에 저장하기
		 * 2. 반복문 돌면서 ArrayList에 저장된 Car 객체의 id를
		 * 	  각각 순서대로 하나씩 불러내서 .drive()메소드를 호출해보기
		 */
		
		//1.
		Car car1=new Car();
		Car car2=new Car();
		Car car3=new Car();
		ArrayList<Car> list=new ArrayList<Car>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		
		//2.
		for(int i=0;i<list.size();i++){
			//i번째 Car 객체의 id 얻어오기
			Car tmp=list.get(i);
			//메소드 호출
			tmp.drive();
		}
		
		System.out.println("---확장 for문을 사용 한다면---");
		for(Car tmp:list){
			tmp.drive();
		}
	}
}
