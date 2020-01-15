package test.main;
/*
 * 0~9까지 출력하는 예제
 */
public class MainClass08 {
	public static void main(String[] args) {
		//제어변수 i값에 0대입하기
		int i=0;
		while(true){			
			System.out.println(i);
			i++;//제어변수 1 증가 시키기
			if(i==10){
				System.out.println("오예! 빠져 나간당...");
				break;
			}
		}
		
		System.out.println(".......................");
		
		i=0;//제어 변수 초기화
		boolean isRun=true;
		while(isRun){
			System.out.println(i);
			i++;
			if(i==10) isRun=false;
		}
	}
}
