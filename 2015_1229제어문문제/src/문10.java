//1~100���� 3�� ��� ����ϰ�, 3�� ����� �� ���ϱ�
public class ��10 {

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
		System.out.println("3�� ����� ��:"+sum);
	}

}
