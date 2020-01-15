package test.mypac;
/*
 * [ Bean 규약에 맞는 DTO 클래스 정의하기 ]
 * 
 * - DTO => Data Transfer Object의 약자이다.
 * - 디폴트 생성자가 있어야 한다.
 * - 생성자의 인자로 멤버필드에 저장 할 값을 모두 전달 할 수 있어야 한다.
 * - 멤버필드에 접근할 메소드 setter, getter 메소드를 정의해야한다.
 */
public class MemberDto {
	//멤버필드
	private int num;
	private String name;
	private String addr;	
	//디폴트 생성자
	public MemberDto(){}
	//멤버필드에 저장 할 값을 인자로 전달 받는 생성자	
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	//멤버필드에 access 할 수 있도록 setter 메소드와 getter 메소드를 정의한다.
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
