/*
 * ����if
 *  ����)
 *  	if(���ǹ�)  ���ǹ�(true/false)
 *  	  ����1  => true�ϋ� ����
 *  	else
 *  	 ����2  => false�϶� ����
 *  
 * 		if(���ǹ�)
 *  	{ 
 *  	 ����1
 *  	 ����2
 *  	}
 *  	else
 *  	{ 
 *  	����3
	 	����4
	 	}
 */
import java.util.Scanner;
public class ���ǹ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("1~100������ ���� �Է�:");
		int num=scan.nextInt();
		if(num<1 || num>100)
		{	
			System.out.println("�߸��� �Է��Դϴ�");
		}
		else //�����Է��̸�
		{
			System.out.println("���� �Է��Դϴ�");
		}
		if(num%2==0)
		{	
			System.out.println(num+"��(��) ¦����");
		}
		else //�����Է��̸�
		{
			System.out.println(num+"��(��) Ȧ����");
		}
	}

}
