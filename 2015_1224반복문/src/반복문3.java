/*
 * up-down ����
 */

import java.util.Scanner;
public class �ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//���� ������ �߻� => 1~100
		int com=(int)(Math.random()*100+1);
		int count=0;
		for(;;) //�ʱⰪ�� ���� ���ǽĵ� ����, ���ѷ����϶�
		{
			System.out.println("1~100���� ������ ���� �Է� :");
			int user=scan.nextInt();
			if(user<1||user>100)
			{
				System.out.println("�߸��� �Է��Դϴ�");
				continue;
			}
			count++;
			//��
			if(com>user)
			{
				System.out.println("�Է°����� ���� ���� �Է��ϼ���");
			}
			else if(com<user)
			{
				System.out.println("�Է°����� ���� ���� �Է��ϼ���");
			}
			else // ==
			{
				System.out.println("Game over!!");
				System.out.println("�Է�Ƚ������:"+(100-count*10));
				break;
			}
		}
	}

}
