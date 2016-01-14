import java.util.Scanner;
public class 문12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 학생 점수 입력:");
		int num1=scan.nextInt();
		System.out.println("두번째 학생 점수 입력:");
		int num2=scan.nextInt();
		System.out.println("세번째 학생 점수 입력:");
		int num3=scan.nextInt();
		System.out.println("네번째 학생 점수 입력:");
		int num4=scan.nextInt();
		System.out.println("다섯번째 학생 점수 입력:");
		int num5=scan.nextInt();
		System.out.println("여섯번째 학생 점수 입력:");
		int num6=scan.nextInt();
		System.out.println("일곱번째 학생 점수 입력:");
		int num7=scan.nextInt();
		System.out.println("여덟번째 학생 점수 입력:");
		int num8=scan.nextInt();
		System.out.println("아홉번째 학생 점수 입력:");
		int num9=scan.nextInt();
		System.out.println("열번째 학생 점수 입력:");
		int num10=scan.nextInt();
		
		int[] jumsu = {num1,num2,num3,num4,num5,num6,num7,num8,num9,num10};
		 for(int i=0; i<jumsu.length; i++)
		 {
			   System.out.println(jumsu[i]);
			  }
		
		int max=0; 
		int min=100;
		
	/*	 for(int i = 0; i<jumsu.length; i++)
			   if(max < jumsu[i])//jumsu[i]값이 max보다 크면
			   {   
			    max = jumsu[i];   //그 값을 max에 저장한다.
			   }
		 for(int j = 0; j<jumsu.length; j++)
			   if(min < jumsu[i])//jumsu[i]값이 max보다 크면
			   {   
			    min = jumsu[i];   //그 값을 max에 저장한다.
			   }
		*/
		
		for(int i=0;i<jumsu.length;i++){
			if(max<jumsu[i])
				max=jumsu[i];
			if(min>jumsu[i])
				min=jumsu[i];}
			
			System.out.println();
			System.out.println("최대값:"+max);
			System.out.println("최소값:"+min);
			
			
			int sum=0;
			double avg=0;
			
	        for ( int i =0 ; i < jumsu.length ; i++)
	        {
	            sum= sum + jumsu[i];
	        }
	            avg = sum / jumsu.length;
	            System.out.println("총합:"+sum);
				System.out.println("평균:"+avg); 
	}
	
}
				


