/*
 * 1~100���� ���� �߻�
 * ������ ���ߴ� ���α׷�
 * �����߻�, �Է�, ��, ���
 */
import java.util.Scanner;
public class �޼ҵ�5 {
	static int getRand()
	{
		/*int rand=(int)(Math.random()*100)+1;
		return rand; �Ʒ��� �� ����� ����*/
		return (int)(Math.random()*100)+1;
	}
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("1~100���� ������ ���� �Է�:");
		return scan.nextInt();
	}
	static boolean hint(int com, int user)
	{
		boolean bCheck=false;
		if(com>user)
		{
			System.out.println("�Է°����� ū �� �Է�...");
		}
		else if(com<user)
		{
			System.out.println("�Է°����� ���� �� �Է�...");
		}
		else
		{
			bCheck=true;
		}
		return bCheck;
	}
	static void process()
	{
		int com=getRand();
		while(true)
		{
			int user=input();
			boolean bCheck=hint(com,user);
			if(bCheck==true)
			{
				System.out.println("������ �ٽ��ұ��(yes(1)/no(2)?");
				Scanner scan=new Scanner(System.in);
				int res=scan.nextInt();
				if(res==1)
				{
					process();
				}
				else
				{
					
					System.out.println("Game Over!!");
					System.exit(0); //���α׷��� ���� ����
				} 
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
