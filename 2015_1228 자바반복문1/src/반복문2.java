//while��
//���� �Է¹޾Ƽ� => �ش� ���� ���
//�Է°�
import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �Է��ض�
		Scanner scan=new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int dan=scan.nextInt();
		//���� �޾Ƽ� ������ ���
		System.out.println("while�� ó��");
		int i=1;
		while(i<=9)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		System.out.println("do~while�� ó��");
		i=1; //i�� ������ 10�϶� �������ͼ� ���� i���� 10��. �׷��� �ٽ� i�� 1�� �ʱ�ȭ , �Ǵ� j��� ������ 1�� �����ص���
		do
		{
			System.out.println(dan+"*"+i+"="+dan*1);
			i++;
		}while(i<=9);
	}
	
}
// ���� ==> ����Ŀ� �ٽ� ����� ����
// int i=10;
// i=5;