package test.mypac;

public class MemberDto {
	//회원의 번호 이름 주소를 저장 할 멤버필드
	private int num;
	private String name;
	private String addr;
	
	//디폴트 생성자
	public MemberDto(){}
	
	//인자로 번호, 이름, 주소를 전달 받는 생성자
	public MemberDto(int num, String name, String addr){
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
	
	//setter, getter 메소드 만들기
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
