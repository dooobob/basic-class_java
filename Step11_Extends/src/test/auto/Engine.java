package test.auto;

public class Engine {
	//엔지이 시작되었는지 여부
	private boolean isStarted=false;
	
	//엔진 시작여부를 전달하는 메소드
	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}
	
	//엔진 시작여부를 리턴해주는 메소드
	public boolean isStarted() {
		return isStarted;
	}

}
