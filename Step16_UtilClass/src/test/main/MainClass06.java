package test.main;

import java.util.HashMap;

public class MainClass06 {
	public static void main(String[] args) {
		//HashMap 객체 생성하기
		HashMap<String, String> map1=new HashMap<String, String>();
		//put메소드를 이용해서 데이터를 저장한다
		//put(key값,value값)
		map1.put("house", "명사, 집");
		map1.put("car", "명사, 자동차");
		map1.put("housen", "명사, 냉장고");
		
		//저장된 데이터를 불러올때는 get(key값)해서 불러온다
		System.out.println(map1.get("house"));
		System.out.println(map1.get("car"));
		System.out.println(map1.get("housen"));
		//존재하지 않는 key값인 경우 null을 리턴한다
		System.out.println(map1.get("merong"));
	}
}
