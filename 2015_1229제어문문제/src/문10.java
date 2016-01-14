//1~100까지 3의 배수 출력하고, 3의 배수의 합 구하기
public class 문10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		do{
			if(i%3==0)
			{
				sum+=i;
				System.out.print(i+"  ");
						
			}
			i++;
		}while(i<=100);
		System.out.println();
		System.out.println("3의 배수의 합:"+sum);
	}

}
