/*
 * 3명의 국어, 영어, 수학점수를 입력받아서
 * 총점, 평균, 학점, 등수를 구해서 출력
 * ==========================
 *  국어  영어  수학  총점  평균  학점  등수
 *  90 =
 *  80 =
 *  70 =
 *  
 *  배열(array)
 *  => 연속적인 메모리 배치
 *  => 같은 데이터형을 모아서 관리 **
 *  형식)
 *  	데이터형[] 배열명; //선언할때 씀 ==> 권장사용방법
 *  	데이터형 배열명[]; //위에 것과 같지만 c언어 형식
 *  
 *  	예)
 *   	int[] a;
 *   	a=new int[5] =>데이터 5개 상자를 만들어줘요! 초기값은 0! 각 상자마다 int니까 4바이트씩! 그러면 총 20바이트
 *   					시작하는 값은 100이기 때문에 a에 100! 
 *   					a[0] => a+0 => 100+0과 같음 / a[1] => a+4
 *   
 *   	예)
 *   		int[] a={1,2,3,4,5};
 *   		a[0]=10 //그러면 1이 10으로 바뀜
 *   		
 */

import java.util.Scanner;
public class 문5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3]; //국어점수 3개 저장  -> new니까 0값 초기화 //배열을 단점 : 데이터 3개이면 더 추가가 안됨
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hak=new char[3];
		int[] rank=new int[3];
		//int[][] jumsu=new in[3][7]; -> 아직 2차원배열을 안배웠기때문에 일단 7줄로.
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.printf("%d번째 국어점수 입력:",(i+1));
			kor[i]=scan.nextInt(); //받아서 저장하라는 것
			System.out.printf("%d번째 영어점수 입력:",(i+1));
			eng[i]=scan.nextInt(); //받아서 저장하라는 것
			System.out.printf("%d번째 수학점수 입력:",(i+1));
			math[i]=scan.nextInt(); //받아서 저장하라는 것
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		//등수
		for(int i=0;i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		//학점
		char score='A';
		for(int i=0;i<3;i++)
		{
			switch((int)(avg[i]/10))
			{
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
				
			}
			hak[i]=score;
		}
		System.out.printf("%10s%10s%10s%12s%18s%10s%10s\n","국어","영어","수학","총점","평균","학점","등수"); 
		//%s는 뒤의 문자를 넣으라는 것, s앞의 숫자는 간격을 준것.
		for(int i=0;i<3;i++)
		{
			System.out.printf("%5d%5d%5d%5d%10.2f%5c%5d\n", //%f는 실수이기때문에 %d가 아니라 f, char면 c로적음
					kor[i],eng[i],math[i],total[i],avg[i],hak[i],rank[i]);
		}

		
	}

}
