package test.main;
/*
 * 국어, 영어, 수학 점수를 임의로 정하고
 * 총점과 평균을 출력하는 프로그램을 완성해보세요
 */
public class MainClass05 {
	public static void main(String[] args) {
		
		int kor;
		int eng;
		int math;
		
		kor=77;
		eng=97;
		math=89;
		
		int sum=kor+eng+math;
		double mean=sum/3.0;
		//정수와 정수를 연산 했을 경우 결과값은 정수만 나오므로 3.0으로 연산한다.
		
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총    점 : "+sum);
		System.out.println("평    균 : "+mean);
	}
}
