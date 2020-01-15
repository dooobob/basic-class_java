package test.main;
/*
 * MainClass02에서 했던 작업과 비교해 보세요!
 */
import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		//DB에 저장할 회원정보라고 가정하자
		int num=12;
		String name="개다리";
		String addr="독산동";
		//저장할 회원의 정보를 MemberDto객체에 담는다.
		MemberDto dto=new MemberDto(num,name,addr);
		
		//MemberDao 객체를 이용해서 DB에 저장하기
		MemberDao dao=MemberDao.getInstance();
		//회원정보 저장하고 결과값을 boolean Type으로 받아와서 변수에 저장
		boolean isSuccess=dao.insert(dto);
		//변수에 있는 boolean Type Data를 확인하면 성공 혹은 실패를 알 수있다.
		if(isSuccess){
			System.out.println("회원정보 입력 성공!");
		}else{
			System.out.println("회원정보 입력 실패!");
		}
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
