import java.util.Scanner;

/*
 *  1) �ߺ����� ���� => int[] com 3��
 *  2) �Է�  	   => int[] user
 *  3) ��	   => s, b
 *  4) ��Ʈ 	   => s, b �����ֱ�
 *  5) ����	   => s==3	
 */
public class ���ھ߱����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];
		int[] user=new int[3];
		int s;
		int b;
		//�ߺ����� ����
		int su=0; //���� ����
		boolean bDash=false; //�ߺ����� Ȯ��
		for(int i=0;i<3;i++)
		{
			bDash=true; //for�� ���۵ɶ����� true��� �ٽ� ������ �Ǿ�� while���� ���ư�
			while(bDash)
			{
				//�����߻�
				su=(int)(Math.random()*9)+1;
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bDash=true;
						break; //while���� ���ǹ����� �̵��Ѵ�.
					}
				}
			}
			com[i]=su;
		}
		
	/*	/*for(int i=0;i<3;i++)
		{
		System.out.print(com[i]+" ");
		}*/ // �ϴ� ���� ������ ���ư����� ����غ�. ���ӿ��� ���������Ƿ� �ּ�!
		//�ּ�
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			//����� �Է�
			System.out.println("���ڸ� ���� �Է�:");
			int input=scan.nextInt();
			//����ó��
			if(input<100 || input>999)
			{
				System.out.println("���ڸ� ������ �Է��ؾ� �մϴ�");
				continue;
				/*
				 * continue��!!
				 * for -> ���������� ��
				 * while���� �� -> ���ǽ����� ��
				 */
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("�ߺ��� ���� ����� �� ����");
				continue;
			}
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0�� ����� �� ����");
				continue;
			}
			//��
			s=0;
			b=0;
			for(int i=0;i<3;i++) //com
			{
				for(int j=0;j<3;j++)//user
				{
					if(com[i]==user[j])//�� => ���� ���� �ִٸ�
					{
						if(i==j)//���� �ڸ�����
							s++;
						else
							b++;
					}
				}
			}
			//��Ʈ
			System.out.printf("Input Number : %d, Result:%dS-%B\n",input,s,b);
		
			//����
			
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}
	}
}

