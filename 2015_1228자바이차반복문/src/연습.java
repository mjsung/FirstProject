
public class ¿¬½À {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		
 ****
 ****
 ****
 ****
 
 */
	for(int i=0;i<4;i++)
	{
		for(int j=0; j<4;j++)
		{	
				System.out.print("*");	
		}	
		System.out.println();
	}
		System.out.println();
		
/*
		
*
**
***
****


*/
		
		for(int i=0; i<4;i++)
		{
			for(int j=0;j<=i;j++)
				{
				System.out.print("*");
				}
			System.out.println();
		}
					
/*
		
****
***
**
*


*/	
		
	for(int i=0;i<=4;i++)
	{
		for(int j=0;j<=4-i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
		
		
/*		
		
   *
  **
 *** 
****

*/

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

}
