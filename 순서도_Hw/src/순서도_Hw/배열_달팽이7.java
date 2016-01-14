package 순서도_Hw;

public class 배열_달팽이7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int[5][5];
	 	int k=0;
	 	int sw=1;
	 	int i=0;
	 	int j=-1;
	 	int n=5;
	 	while(true){
	 	for(int p=0;p<n;p++)
	 	{
	 		k++;
	 		j=j+sw;
	 		arr[i][j]=k;
	 	}
	 	n--;
	 	if(n>=0)
	 	{
	 		for(int p=0;p<n;p++)
		 	{
		 		k++;
		 		i=i+sw;
		 		arr[i][j]=k;
		 	}	
	 		sw=sw*(-1);
	 	}
	 	else{
	 		break;
	 	}
	}

 	for(int a=0;a<5;a++)
		{
			for(int b=0;b<5;b++)
			{
				if(arr[a][b]==0)
					System.out.print("\t");
				else
					System.out.print(arr[a][b]+"\t");
			}
			//줄간격
			System.out.println();

}
	}
}
