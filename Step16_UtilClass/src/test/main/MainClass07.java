package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * HashMap 객체에 회원정보 담아보기
		 */
		Map<String,Object> map1=new HashMap<String, Object>();
		map1.put("num", 1);
		map1.put("name", "김씨");
		map1.put("addr", "서울");
		
		Map<String,Object> map2=new HashMap<String, Object>();
		map2.put("num", 2);
		map2.put("name", "이씨");
		map2.put("addr", "인천");
		
		Map<String,Object> map3=new HashMap<String, Object>();
		map3.put("num", 3);
		map3.put("name", "박씨");
		map3.put("addr", "대전");
		
		//ArrayList 객체 생성해서 id값을 Map인터페이스 Type으로 담기
		List<Map<String,Object>> list=
				new ArrayList<Map<String,Object>>();
		//add()메소드를 이용해서 HashMap 객체의 id 순서대로 저장하기
		list.add(map1);
		list.add(map2);
		list.add(map3);
		//반복문 돌면서 list에 들어있는 회원정보를 출력 해보세요!
		for(int i=0;i<list.size();i++){
			//i번째 HashMap 객체의 id 얻어오기
			Map<String,Object> tmp=list.get(i);
			//HashMap 객체에서 get() 메소드를 이용해서
			//저장된 데이터를 읽어와서 원래 data Type으로 casting해서
			//변수에 담는다.
			int num=(Integer)tmp.get("num");
			String name=(String)tmp.get("name");
			String addr=(String)tmp.get("addr");
			System.out.println("번호 : "+num+"\n이름 : "+name+"\n주소 : "+addr);
			//System.out.println(tmp.get("num"));
			//System.out.println(tmp.get("name"));
			//System.out.println(tmp.get("addr"));
			System.out.println("\n");
		}
	}
}
