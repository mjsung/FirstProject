import java.util.Scanner;
public class ���ڿ�3 {
	static String calc(int a, char op, int b)
	{
		String str=""; //�ʱ�ȭ
		int res=0;
		switch(op)
		{
		case '+':
			res=a+b;
			str=String.valueOf(res); //valueOf : ��� ���������� ���ڿ��� ����
			break;
		case '-':
			res=a-b;
			str=String.valueOf(res); //���ڿ��� �Ѿ
			break;
		case '*':
			res=a*b;
			str=String.valueOf(res); //���ڿ��� �Ѿ
			break;
		case '/':
			if(b==0)
				str="0���� ���� �� �����ϴ�";
			else
			{
			res=a/b;
			str=String.valueOf(res); //���ڿ��� �Ѿ
			}
			break;
			default:
				str="�߸��� �������Դϴ�";
		}
		return str;
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : " );
		int a=scan.nextInt();
		System.out.print("������ �Է�(+,-,*,/): " );
		String op=scan.next();
		System.out.print("�ι�° ���� �Է� : " );
		int b=scan.nextInt();
		
		String result=calc(a,op.charAt(0),b); //op.charAt(0)�� ���ڿ� ������ �����;���
		System.out.println("���: "+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
