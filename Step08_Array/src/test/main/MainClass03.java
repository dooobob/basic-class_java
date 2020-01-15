package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * int[] Type객체에 10, 20, 30, 40, 50을 순서대로 담아 보세요...
		 * 
		 * double[] Type객체에 10.1, 10.2, 10.3, 10.4, 10.5를 순서대로 담아보세요
		 */		
		
		/*
		int[] num=new int[5];
		for(int i=0;i<num.length;i++){
			num[i]=(i+1)*10;
			System.out.println(num[i]);
		}
		System.out.println(".....................................\n");
		
		double[] num2=new double[5];
		for(int j=0;j<num2.length;j++){
			num2[j]=10+(j+1)*0.1;
			System.out.println(num2[j]);
		}*/
		
		int[] nums={10,20,30,40,50};
		int[] nums2=new int[5];
		//int[] nums3={0,0,0,0,0};
		nums2[0]=10;
		nums2[1]=20;
		nums2[2]=30;
		nums2[3]=40;
		nums2[4]=50;
		
		
		double[] dNums={10.1,10.2,10.3,10.4,10.5};
		double[] dNums2=new double[5];
		//double[] dNums3={0.0,0.0,0.0,0.0,0.0};
		dNums2[0]=10.1;
		dNums2[1]=10.2;
		dNums2[2]=10.3;
		dNums2[3]=10.4;
		dNums2[4]=10.5;
		
		//배열에 저장된 내용 출력해보기
		for(int i=0;i<nums.length;i++){
			//i번째 방의 int Type 데이터를 불러온다.
			int tmp=nums[i];
			System.out.println("nums의 "+i+"번째방 : "+tmp);
		}
		
		for(int i=0;i<nums.length;i++){
			double tmp=dNums[i];
			System.out.println("dNums의 "+i+"번째방 : "+tmp);
		}
		
		
		System.out.println("---- 확장 for 문을 사용한다면 ----");
		
		System.out.println("nums배열에 저장된 값 출력해보기");
		for(int tmp:nums){
			System.out.println(tmp);
		}
		
		System.out.println("dNums배열에 저장된 값 출력해보기");
		for(double tmp:dNums){ 
			System.out.println(tmp);
		}
	}
}
