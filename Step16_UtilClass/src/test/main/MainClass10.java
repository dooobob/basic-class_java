package test.main;

import java.util.HashSet;
import java.util.Iterator;
/*
 * [ Set ]
 * 
 * - 순서가 없다
 * - 키값도 없다
 * - 중복을 허용하지 않는다.
 * - 모든 데이터를 추출 할때는 Iterator Type 객체를 사용한다.
 */
public class MainClass10 {
	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<String>();
		set1.add("김구라");
		set1.add("해골");
		set1.add("원숭이");
		set1.add("주뎅이");
		set1.add("덩어리");
		//Iterator() 메소드를 이용해서 Iterator Type객체를 얻어온다.
		Iterator<String> it=set1.iterator();
		//커서 다음에 데이터가 있는지 확인해서 있는 동안에만 반복문을 돈다.
		while(it.hasNext()){
			//.next() 메소드를 이용해서 커서를 한칸 이동하고 해당위치에 있는
			//데이터를 가져온다.
			String tmp=it.next();
			//가져온 데이터를 출력해보기
			System.out.println(tmp);
		}
		System.out.println("exit");
	}
}
