package ������_Hw;

public class �迭_������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][5];
		int k=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				k++;
				arr[j][i]=k;
				
			}
		}
		//���
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr[i][j]==0)
					System.out.print("\t");
				else
					System.out.print(arr[i][j]+"\t");
			}
			//�ٰ���
			System.out.println();
		}
	}
	}


