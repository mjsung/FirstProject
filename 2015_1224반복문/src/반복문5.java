/*
 * �����߻� ==> o,x
 */
import java.util.Scanner;
public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			int dap=(int)(Math.random()*2);
			// 0, 1 (o, x)
			System.out.print("X(0),0(1) �Է� :");
			int user=scan.nextInt();
			if(dap==0)
			{
				System.out.println("x");
			}
			if(dap==1)
			{
				System.out.println("o");
			}
			if(user==0)
			{
				System.out.println("x");
			}
			if(user==1)
			{
				System.out.println("o");
		}
			//�����
			if(dap==user)
			{
			count++;	
			}
			}
		System.out.println("ä�����:"+(count*10)+"��");
	}

}
