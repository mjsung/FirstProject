/*
 * �޼ҵ� : �� ���� ����� �����ϴ� ��ɹ��� ���� ==> ������ ����
 * 		�ݺ������ϴ� ���
 * 		����)
 * 			�����(��������) �޼ҵ��(�Է°�.....)
 * 			{
 * 				ó��
 * 				������� �����ش�
 * 				return �����
 * 				***void�� ��쿡�� ������ ����
 * 			}
 * 				ȣ�� ==> �޼ҵ�� (�Է°�)
 * 
 * 		 �����            �Է°�
 * 		================
 * 		 o   	 o
 *       o  	 x    ====> double random() / int nextInt()
 *       x  	 o    ====> void main(String[] args)
 *       x(void) x()
 *       
 */
import java.util.Scanner;
public class �޼ҵ�1 {
	// �Ű�����(����� �Է°�), ������(ó�� �����)
	static int plus(int a, int b)
	{
		//ó��
		int c=a+b;
		return c;
	}
	
	static int minu(int a, int b)
	{
		//ó��
		int c=a-b;
		return c;
	}
	
	static int gop(int a, int b)
	{
		//ó��
		int c=a*b;
		return c;
	}
	
		
	static double div(int a, int b)
	{
		//ó��
		double d=a/ (double)b;
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1'�����Է� : ");
		int a= scan.nextInt();
		System.out.print("2' �����Է� : ");
		int b=scan.nextInt();
		
		//+
		int res=plus(a,b);
		System.out.println("res="+res);
	}

}
