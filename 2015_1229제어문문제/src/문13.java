import java.util.Scanner;
public class 문13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[5]; 
		int[] eng=new int[5];
		int[] math=new int[5];
		int[] total=new int[5];
		double[] avg=new double[5];
		
		//int[][] jumsu=new in[3][7]; -> 아직 2차원배열을 안배웠기때문에 일단 7줄로.
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.printf("%d번째 국어점수 입력:",(i+1));
			kor[i]=scan.nextInt(); //받아서 저장하라는 것
			System.out.printf("%d번째 영어점수 입력:",(i+1));
			eng[i]=scan.nextInt(); //받아서 저장하라는 것
			System.out.printf("%d번째 수학점수 입력:",(i+1));
			math[i]=scan.nextInt(); //받아서 저장하라는 것
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;}
			System.out.printf("%10s%10s%10s%12s%18s\n","국어","영어","수학","총점","평균"); 
			//%s는 뒤의 문자를 넣으라는 것, s앞의 숫자는 간격을 준것.
			
			for(int i=0;i<5;i++)
			{
				System.out.printf("%5d%5d%5d%5d%10.2f\n", //%f는 실수이기때문에 %d가 아니라 f, char면 c로적음
						kor[i],eng[i],math[i],total[i],avg[i]);
			}

			
		

	}

	

}
