package ������_Hw;

public class �迭_���������ﰢ��3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][5];
		int k=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				arr[i][j]=k;
				k++;
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


