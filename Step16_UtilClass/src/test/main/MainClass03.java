package test.main;

import java.util.ArrayList;

import test.mypac.Car;
import test.mypac.MemberDto;

public class MainClass03 {
	public static void main(String[] args) {
		//int Type을 저장 할 수 있는 ArrayList 객체를 생성해보세요
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		//double Type을 저장 할 수 있는 ArrayList 객체를 생성해보세요
		ArrayList<Double> list2=new ArrayList<Double>();
		list2.add(10.1);
		list2.add(20.1);
		list2.add(30.1);		
		//String Type을 저장 할 수 있는 ArrayList 객체를 생성해보세요
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("하나");
		list3.add("두울");
		String str="세엣";
		list3.add(str);		
		//Car Type을 저장 할 수 있는 ArrayList 객체를 생성해보세요
		ArrayList<Car> list4=new ArrayList<Car>();
		list4.add(new Car());
		list4.add(new Car());
		Car car=new Car();
		list4.add(car);		
		//MemberDto Type을 저장 할 수 있는 ArrayList 객체를 생성해보세요
		ArrayList<MemberDto> list5=new ArrayList<MemberDto>();
		list5.add(new MemberDto());
		list5.add(new MemberDto());
		MemberDto dto=new MemberDto();
		list5.add(dto);		
	}
}
