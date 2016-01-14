/*
 *      ====================
 *			   	1
 *		====================
 *			2	3	4
 *		====================
 *		5	6	7	8	9
 *		==================== ***나눠서 for문
 *			10	11	12
 *		====================
 *				13
 *		====================
 *
 *		줄수 (행) 데이터 (열)
 *		  0		 2			시작점 : i+js=2 => js=2-i
 *		  1		1-3			끝점: i+2=je
 *		  2		0-4
 *		================
 *		  3		1-3			시작점 :i=j+2 =>j=i-2
 *		  4		 2			끝점 : i+j=6 => j=6-i
 *
 *	
 * */
public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] arr=new int[5][5];
			int k=1;
			for(int i=0; i<=2;i++)
			{
				for(int j=2-i;j<=i+2;j++)
				{
					arr[i][j]=k++;
				}
			}
			for(int i=3;i<=4;i++)
			{
				for(int j=i-2;j<=6-i;j++)
				{
					arr[i][j]=k++;
				}
			}
			//출력
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(arr[i][j]==0)
						System.out.print("\t");
					else
						System.out.print(arr[i][j]+"\t");
				}
				//줄간격
				System.out.println();
			}
	}

}
