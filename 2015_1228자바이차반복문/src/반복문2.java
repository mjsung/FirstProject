/*
 * A
 * BC
 * DEF
 * GHIJ
 * 
 *  
 * A
 * AB
 * ABC
 * ABCD
 * 
 
 * 
 * 1###
 * #2##
 * ##3#
 * ###4
 */
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		  for(int i=1;i<=4;i++)
		  {
		   	for(int j=1;j<=i;j++)
		   {
		   	System.out.print(ch++);
		   }
		   System.out.println();
		  }
		  
		  
		  ch='A';
		  for(int i=1;i<=4;i++)
		  {
			ch='A';  //각줄에 A로 시작하겠다고 설정하는 것.
		   	for(int j=1;j<=i;j++)
		   {
		   	System.out.print(ch++);
		   }
		   System.out.println();
		  }
		  
		  
		  
		  for(int i=1;i<=4;i++)
		  {
		   	for(int j=1;j<=4;j++)
		   {
		   	if(i==j)
		   		System.out.print(i);
		   	else
		   		System.out.print("#");
		   }
		   System.out.println();
		  }
	}

}
