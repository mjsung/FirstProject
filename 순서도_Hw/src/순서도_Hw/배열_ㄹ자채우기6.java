package ������_Hw;

public class �迭_����ä���6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int[5][5];
	 	int k=0;
	 	int begin=0;
	 	int end=4;
	 	int sw=1;
	 	for(int i=0;i<5;i++)
	 	{
	 		if(sw==1)
	 		 {
	 			for(int j=begin;j<=end;j+=sw)
	 			{
	 			k++;
	 			arr[i][j]=k;
	 			}
	 			int temp=begin;
		 		begin=end;
		 		end=temp;
		 		sw=sw*(-1);
	 		 }
	 		else
	 		{
	 				for(int j=begin;j>=end;j+=sw)
		 			{
		 			k++;
		 			arr[i][j]=k;
		 			}
	 				int temp=begin;
	 		 		begin=end;
	 		 		end=temp;
	 		 		sw=sw*(-1);
	 		 	}
	 		}
	 	
	 	
	 		
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
