
public class 문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0;
		int odd=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				even+=i;
			else
				odd+=i;
				
		}
		System.out.println("짝수의 합은:"+even);
		System.out.println("홀수의 합은:"+odd);
	}

}
