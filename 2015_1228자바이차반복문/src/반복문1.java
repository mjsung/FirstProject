/*
 *  2�� for
 *  ����)
 *  		 1	 2   7
 *  	for(�ʱⰪ;���ǽ�;������)
 *  	{		 3   4   6
 *  		for(�ʱⰪ;���ǽ�;������)
 *  		{
 *  			���๮�� 5
 *  		}
 *  	}
 *  	1==> 2 ==>
 *  		(3->4->5->6, 4->5->6....4���� false��  7������ ����)
 *  		2���� false�� ����
 *  
 *  *********1�� for�� :�ټ�
 *  		 2�� for�� : ���๮��
 *  
 *  
 *  ����1)
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
 *  ����2)
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
			  	
	����3)
	
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
 *   4    1  => �����̸� ���Ѵ�
 *   i+j=5 
 *   
 *      *
 *     **
 *    *** 
 *   ****
 *   i  j  k
 *   �ټ�  ����  ��ǥ
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
public class �ݺ���1 {

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
