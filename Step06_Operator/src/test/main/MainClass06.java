package test.main;
/*
 * [ 연 산 자 ]
 * 
 * 6. 3항 연산자
 * 
 * boolean Type? true인 경우 대치될 값 : false인 경우 대치될 값
 */
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=true;
		String result=isWait?"기다려":"기다리지마!";
		System.out.println(result);
		
		//위의 표현을  if~else 문으로 바꾼다면
		
		String result2=null;
		if(isWait){
			result2="기다려!";			
		}else{
			result2="기다리지마!";
		}
		System.out.println(result2);
		
		boolean isMinus=false;
		
		int result3=isMinus?-10:10;
		
		System.out.println(result3);
	}
}
