package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//String Type을 담을 수 있는 방 5개짜리 String[] 객체 생성해서
		//id값을 names라는 변수에 담기
		String[] names=new String[5];
		//String[] names2={null,null,null,null,null};
		
		//각각의 방에 String Type 데이터 담기
		names[0]="김구라";
		names[1]="해골";
		names[2]="원숭이";
		
		//반복문 돌려서 방의 내용 출력해보기
		for(int i=0;i<names.length;i++){
			System.out.println(i+"번째방 : "+names[i]);
		}
	}
}
