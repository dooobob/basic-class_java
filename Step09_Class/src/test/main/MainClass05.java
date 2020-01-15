package test.main;

import test.mypac.Locker;

/*
 * 1. Locker 객체를 5개 생성해서 id값을 5개의 변수에 각각 담는다.
 * 2. 5개의 Locker 객체의 멤버필드 num에 1,2,3,4,5를 각각 저장한다.
 * 3. 5개의 Locker 객체의 .saveMessage()메소드를 이용해서 임의의 메세지를 각각 저장한다.
 * 4. 5개의 Locker 객체의 id를 Locker[] Type에 순서대로 저장한다.
 * 5. 반복문 돌면서 Locker[]객체에 담긴 Locker 객체의 id를 하나씩 불러와서
 * 		.showMessage()메소드를 호출해본다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		Locker loc1=new Locker();
		Locker loc2=new Locker();
		Locker loc3=new Locker();
		Locker loc4=new Locker();
		Locker loc5=new Locker();
		
		loc1.num=1;
		loc2.num=2;
		loc3.num=3;
		loc4.num=4;
		loc5.num=5;
		
		loc1.saveMessage("1번 locker입니다.");
		loc2.saveMessage("2번 locker입니다.");
		loc3.saveMessage("3번 locker입니다.");
		loc4.saveMessage("4번 locker입니다.");
		loc5.saveMessage("5번 locker입니다.");
		
		
		Locker[] Loc={loc1,loc2,loc3,loc4,loc5};
		
		/*
		Locker[] Loc=new Locker[5];
		Loc[0]=loc1;
		Loc[1]=loc2;
		Loc[2]=loc3;
		Loc[3]=loc4;
		Loc[4]=loc5;
		*/
		
		for(int i=0;i<Loc.length;i++){
			Loc[i].showMessage();
		}
		
		System.out.println("\n확장 for문을 사용한다면");
		
		for(Locker tmp:Loc){
			tmp.showMessage();
		}
	}

}
