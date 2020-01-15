package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		int i=0;
		while(i<10){//비교 연산자를 이용해서 원하는 만큼 반복 시키기
			System.out.println(i);
			i++;
		}
		System.out.println("................");
		
		//위의 while문을 for문으로 바꾸면
		for(int j=0;j<10;j++){//j는 for문 안에서만 유효한 변수이다.
			System.out.println(j);
		}
	}
}
