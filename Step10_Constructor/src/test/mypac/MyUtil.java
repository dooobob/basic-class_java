package test.mypac;

public class MyUtil {
	
	//인자로 전달받은 회원정보를 출력해주는 static 멤버 메소드
	public static void showInfo(int num,String name,String addr){
		System.out.println("번호 : "+num+"\n이름 : "+name+"\n주소 : "+addr);
	}
	
	public static void showInfo2(MemberDto dto){
		System.out.println
		("번호 : "+dto.getNum()+"\n이름 : "+dto.getName()+"\n주소 : "+dto.getAddr());
	}
}
