package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/*
 * [ 로또 번호 추출기 ]
 * 
 * hint
 * 
 * - 1~45사이의 랜덤한 정수 얻어내기 = ran.nextInt(45)+1;
 * - new HashSet<Integer>();
 * - 반복문은 while문을 사용하세요
 * - Set Type객체의 .size()는 저장된 데이터의 갯수를 리턴해준다.
 */
public class MainClass11 {
	public static void main(String[] args) {
		Random ran=new Random();
		Set<Integer> set=new HashSet<Integer>();
		
		//반복문 돌면서 HashSet 객체에 랜덤함 수를 6개가 될 때까지 담는다.
		//set의 사이즈가 6보다 작은 동안에 반복문을 수행한다
		while(set.size()<6){
			//1~45사이의 정수중에 랜덤한 수 1개를 추출한다.
			int ranNum=ran.nextInt(45)+1;
			//set 객체에 저장한다.(중복된 데이터인 경우는 size가 증가하지 않는다)
			set.add(ranNum);
			//set.add(ran.nextInt(45)+1);
		}
		
		//HashSet 객체에 담긴 데이터를 출력하기 위해 Iterator 객체를 얻어온다.
		Iterator<Integer> it=set.iterator();
		//커서 바로 다음에 데이터가 있는지 확인해서 있는 동안에만 반복문을 수행한다.
		while(it.hasNext()){
			//커서를 다음 라인으로 옴기면서 해당위치의 데이터를 불러본다.
			int num=it.next();
			//출력!
			System.out.print(num+"/");
			//System.out.print(it.next()+" / ");
		}
		
		System.out.println("\nexit");
	}
}
