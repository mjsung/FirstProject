/*
 * ��� : ���α׷��� �°� ��� �ϴ� ���α׷�
 * ���ǹ�
 *  ���� if
 *  1) ����
 *  	=> if(���ǹ�)
 *  	   ���� =====> ���ǹ��� true�� ���� ����
 *  		=====> ���ǹ��� false�� ���� �������� �ʴ´�
 *  	=> ���� ���� ������ ���ÿ� ����
 *  	   if(���ǹ�)
 *  		{
 *  			���� 1
 *  			���� 2
 *  		}
 *  	****�ڹٿ��� ����� {}����� ���� ��쿡 �ٷ� �ؿ� �ִ� ���� 1���� �����Ѵ�.
 *  	=> ������ true, false�϶� �ٸ� ������ ����
 *  		if(���ǹ�)
 *  		  ���� 1
 *  		else
 *  		  ���� 2
 */
//�ڹٿ��� �����ϴ� Ŭ������ ������ �� import ���
import java.util.Scanner;
//Scanner : Ű���� �Է°��� �޴� ���
public class ���ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� Math.random() => 0.0~0.99
/*		int rand=(int)(Math.random()*100)+1;
		System.out.println("rand="+rand);
*/		//������ �߻��ϴ� �̷� ����� �޼ҵ��� ��
		/*Scanner scan=new Scanner(System.in);
		//scan Ű����� �Է��� ���� �������� ��, new�� ������� ������ �ȴ�.
		System.out.println("���� �Է�: ");
		int num=scan.nextInt();
		System.out.println("num="+num);
		//�̰��� �Է°��� ���� �� �ִ� ���
*/
		int com=(int)(Math.random()*3); //0,1,2 �߿� ����
		Scanner scan=new Scanner(System.in);
		System.out.println("����(0), ����(1), ��(2) �Է�:");
		int user=scan.nextInt();
		if(user==0)
			System.out.println("�����:����");
		if(user==1)
			System.out.println("�����:����");
		if(user==2)
			System.out.println("�����:��");
		
		if(com==0)
			System.out.println("��ǻ��:����");
		if(com==1)
			System.out.println("��ǻ��:����");
		if(com==2)
			System.out.println("��ǻ��:��");
		
		//��� ���
		//��ǻ�Ͱ� => ����
		/*if(com==0)
		{
			if(user==0)
				System.out.println("����");
			if(user==1)
				System.out.println("����ڰ� �̰��");
			if(user==2)
				System.out.println("��ǻ�Ͱ� �̰��");
					}
		//��ǻ�Ͱ� => ����
		if(com==1)
		{
			if(user==0)
				System.out.println("��ǻ�Ͱ� �̰��");
			if(user==1)
				System.out.println("����");
			if(user==2)
				System.out.println("����ڰ� �̰��");
					}
		//��ǻ�Ͱ� => ��
		if(com==2)
		{
			if(user==0)
				System.out.println("����ڰ� �̰��");
			if(user==1)
				System.out.println("��ǻ�Ͱ� �̰��");
			if(user==2)
				System.out.println("����");
					}*/
		
		/*
		 * com-user
		 * 	��ǻ��(com)
		 *   0
		 *   		�����(user)
		 *   		 0 => 0    SAME
		 *   		 1 => -1   USER
		 *   		 2 => -2   COM
		 *   1
		 *          �����(user)
		 *   		 0 => 1    COM
		 *   		 1 => 0    SAME
		 *   		 2 => -1   USER
		 *   2
		 *          �����(user)
		 *   		 0 => 2    USER
		 *   		 1 => 1    COM
		 *   		 2 => 0    SAME
		 *   
		 *   ==> USER : -1, 2
		 *   ==> COM : -2, 1
		 *   ==> SAME : 0
		 */

			int res=com-user;
			if(res==-1 || res==2)
				System.out.println("����ڰ� �̰��");
			if(res==-2 || res==1)
				System.out.println("��ǻ�Ͱ� �̰��");
			if(res==0)
				System.out.println("����");

	}

}

