/*
 * 5���� ���� �����ϰ�
 * ����� ������� ó�� (����) DESC, ASC
 * 
 * ��������(������ ������ �����س���)
 * 
 * 		10 30 50 40 20  ==> 10 20 30 40 50
 * 
 * 
 */
public class �迭2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={45,56,73,34,21};
		System.out.println("������:");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("������:");
		
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
