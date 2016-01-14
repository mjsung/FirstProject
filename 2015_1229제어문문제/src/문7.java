
public class 문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			if(i%5==0)
				{
				System.out.print(i+"\t");
				sum+=i;
				}
			
		}
		System.out.println();
		System.out.println("5의 배수합:"+sum);
	}

}
