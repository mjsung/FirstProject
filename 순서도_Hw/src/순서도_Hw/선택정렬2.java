package 순서도_Hw;

public class 선택정렬2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={35,56,84,15,26};
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			System.out.print(arr[i]+" ");
		}
		
	}

}
