package test.mypac;

public class YourFactory {
	/*
	 * static 멤버를 가지고 있는 inner class는 static 예약어를
	 * 붙여 주어야 한다.
	 */
	public static class Ramen{
		public static void eat(){
			System.out.println("라면을 먹어요");
		}
	}
	
	public Ramen getRamen(){
		return new Ramen();
	}
}
