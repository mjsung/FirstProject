/*
 * 1~45���� 6���� �ߺ����� ���� �߻�
 * ����ڰ� 6�� �Է� ==>��
 * 3-->4��
 * 4-->3��
 * 5-->2��
 * 6-->1��
 */
import java.util.Scanner;;
public class �ζǼ��ڻ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1=new int[6];
		int[] user=new int[6];
		//�ߺ����� ����
				int su=0; //���� ����
				boolean bDash=false; //�ߺ����� Ȯ��
				for(int i=0;i<6;i++)
				{
					bDash=true; //for�� ���۵ɶ����� true��� �ٽ� ������ �Ǿ�� while���� ���ư�
					while(bDash)
					{
						//�����߻�
						su=(int)(Math.random()*45)+1;
						bDash=false;
						for(int j=0;j<i;j++)
						{
							if(num1[j]==su)
							{
								bDash=true;
								break; //while���� ���ǹ����� �̵��Ѵ�.
							}
						}
					}
					num1[i]=su;
				}
				//������Է�
				Scanner scan=new Scanner(System.in);
				for(int i=0;i<6;i++)
				{
					System.out.print("1~45���� ������ �Է�:");
					int no=scan.nextInt();
					if(no<1 || no>45)
					{
						System.out.println("1~45���� ������ �Է��ϼ���");
						i--; //�����ϸ� �߸��Է��� �κ��� Ƚ���� ������ ���Ƿ�
						continue;
					}
					user[i]=no;
				}
				System.out.println("�ζ� ��÷��ȣ");
				for(int i=0;i<6;i++)
				{
					System.out.print(num1[i]+" ");
				}
				System.out.println();
				System.out.println("�����Է°�");
				for(int i=0;i<6;i++)
				{
					System.out.print(user[i]+" ");
				}
				System.out.println();
				int count=0;
				for(int i=0;i<6;i++)
				{
					for(int j=0;j<6;j++)
					{
						if(num1[i]==user[j])
							count++;
					}
				}
				switch(count)
				{
				case 0:
				case 1:
				case 2:
					System.out.println("��");
					break;
				case 3:
					System.out.println("4�� ��÷(5000��");
					break;
				case 4:
					System.out.println("3�� ��÷(1,500,000��");
					break;
				case 5:
					System.out.println("2�� ��÷(56,000,000��");
					break;
				case 6:
					System.out.println("1�� ��÷(1��");
					break;
				}
		}
}
		

