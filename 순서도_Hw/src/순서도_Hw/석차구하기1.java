package 순서도_Hw;

public class 석차구하기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu[]=new int[5];
		int rank[]=new int[5];
		for(int i=1;i<jumsu.length;i++)
		{
			jumsu[i]=(int)(Math.random()*100)+1;
			
		}
		for(int i=1;i<jumsu.length;i++)
		{
			System.out.print(jumsu[i]+" ");
		}
		
		for(int i=1;i<=5;i++)
		{
			rank[i]=1;
			for(int j=1;j<=5;j++)
			{
				if(jumsu[i]<jumsu[j])
				{
					rank[i]=rank[i]+1;
				}
				else
					rank[i]=rank[i];
			}
			
		}
		for(int i=1;i<jumsu.length;i++)
		{
			System.out.print(jumsu[i]+" ");
			System.out.println(rank[i]+" ");
		}
		
	}

}
