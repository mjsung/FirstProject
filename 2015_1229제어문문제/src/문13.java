import java.util.Scanner;
public class ��13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[5]; 
		int[] eng=new int[5];
		int[] math=new int[5];
		int[] total=new int[5];
		double[] avg=new double[5];
		
		//int[][] jumsu=new in[3][7]; -> ���� 2�����迭�� �ȹ���⶧���� �ϴ� 7�ٷ�.
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.printf("%d��° �������� �Է�:",(i+1));
			kor[i]=scan.nextInt(); //�޾Ƽ� �����϶�� ��
			System.out.printf("%d��° �������� �Է�:",(i+1));
			eng[i]=scan.nextInt(); //�޾Ƽ� �����϶�� ��
			System.out.printf("%d��° �������� �Է�:",(i+1));
			math[i]=scan.nextInt(); //�޾Ƽ� �����϶�� ��
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;}
			System.out.printf("%10s%10s%10s%12s%18s\n","����","����","����","����","���"); 
			//%s�� ���� ���ڸ� ������� ��, s���� ���ڴ� ������ �ذ�.
			
			for(int i=0;i<5;i++)
			{
				System.out.printf("%5d%5d%5d%5d%10.2f\n", //%f�� �Ǽ��̱⶧���� %d�� �ƴ϶� f, char�� c������
						kor[i],eng[i],math[i],total[i],avg[i]);
			}

			
		

	}

	

}
