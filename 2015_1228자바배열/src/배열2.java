/*
 * 5개의 값을 설정하고
 * 출력을 순서대로 처리 (정렬) DESC, ASC
 * 
 * 선택정렬(기준을 가지고 변경해나감)
 * 
 * 		10 30 50 40 20  ==> 10 20 30 40 50
 * 
 * 
 */
public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={45,56,73,34,21};
		System.out.println("정렬전:");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("정렬후:");
		
		for(int i=0;i<4;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		}
		
	}

}
