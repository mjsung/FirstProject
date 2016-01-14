/*
 *  2차 for
 *  형식)
 *  		 1	 2   7
 *  	for(초기값;조건식;증가식)
 *  	{		 3   4   6
 *  		for(초기값;조건식;증가식)
 *  		{
 *  			실행문장 5
 *  		}
 *  	}
 *  	1==> 2 ==>
 *  		(3->4->5->6, 4->5->6....4번이 false면  7번으로 전송)
 *  		2번이 false면 종료
 *  
 *  *********1차 for문 :줄수
 *  		 2차 for문 : 실행문장
 *  
 *  
 *  예제1)
 *  ****
 *  ****
 *  ****
 *  ****
 *  
 *  for(int i=1;i<=4;i++)
 *  {
 *  	for(int j=1;j<=4;j++)
 *  	{
 *  		System.out.print("*");
 *  	}
 *  	System.out.println();
 *  }
 *  
 *  예제2)
 *  *
 *  **
 *  ***
 *  ****
 *  
 *  for(int i=1;i<=4;i++)
			  {
			  	for(int j=1;j<=i;j++)
			  	{
			  		System.out.print("*");
			  	}
			  	System.out.println();
			  	}
			  	
	예제3)
	
 *	****
 *	***
 *	**
 *	*
 *  
 *  for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
 *  
 *   i    j
 *   1	  4
 *   2	  3
 *   3	  2		
 *   4    1  => 역순이면 더한다
 *   i+j=5 
 *   
 *      *
 *     **
 *    *** 
 *   ****
 *   i  j  k
 *   줄수  공백  별표
 *   1  3  1
 *   2  2  2
 *   3  1  3
 *   4  0  4
 *   
 *   i+j=4 ==> j=4-i
 *   i=k ==> k=i
 *   
 *   for(int i=1;i<=4;i++)
			  {
			  	for(int j=1;j<=4-i;j++)
			  	{
			  		System.out.print(" ");
			  	}
			  	for(int k=i;k<=4-i;j++)
			  	{
			  		System.out.print(" ");
			  	}
			  	System.out.println();
			 	  	
	}
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
			  {
			  	for(int j=1;j<=4;j++)
			  	{
			  		System.out.print("*");
			  	}
			  	System.out.println();
			 	  	
	}
		for(int i=1;i<=4;i++)
		  {
		  	for(int j=1;j<=i;j++)
		  	{
		  		System.out.print("*");
		  	}
		  	System.out.println();
		  }
		 for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=5-i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		 for(int i=1;i<=4;i++)
		  {
		  	for(int j=1;j<=4-i;j++)
		  	{
		  		System.out.print(" ");
		  	}
		  	for(int k=i;k<=i;k++)
		  	{
		  		System.out.print("*");
		  	}
		  	System.out.println();
		 	  	
}
		 for(int i=1;i<=4;i++)
		  {
		  	for(int j=1;j<=i-4;j++)
		  	{
		  		System.out.print(" ");
		  	}
		  	for(int k=5-i;k<=i-1;k++)
		  	{
		  		System.out.print("*");
		  	}
		  	System.out.println();
		 	  	
}
	}
}
