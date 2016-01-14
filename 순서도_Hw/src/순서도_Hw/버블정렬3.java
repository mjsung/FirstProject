package 순서도_Hw;

public class 버블정렬3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={35,56,84,15,26};
		for(int i=0;i<=4;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<5-i;j++)
			{
				if(arr[j]>arr[j]+1)
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
			System.out.print(arr[i]+" ");
		}
	}

}
