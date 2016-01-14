/*
 * 정렬
 * 1) 선택 정렬(ASC - 작은걸 앞으로)
 * 		30 20 40 10 50
 * 		== ==
 * 		==    ==
 * 		==       ==
 * 		==          ==
 * 	
 * 2) 버블 정렬
 * 		30 20 40 10 50
 * 		== ==
 * 		   == ==
 * 			  == ==
 * 				 == ==
 */
import java.util.Arrays;
public class 메소드정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬전 : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("정렬후 : ");
		Arrays.sort(arr);
		for(int i=0;i<5;i++)
        {
        	System.out.print(arr[i]+" ");
        }
		System.out.println();
/*		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
		{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		}
		}
		for(int i=0;i<5;i++)
        {
        	System.out.print(arr[i]+" ");
        }
		System.out.println();*/
		
	}

}
