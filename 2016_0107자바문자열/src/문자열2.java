//charAt : ���ڿ����� ���ϴ� ���ڸ� �Ѱ� �޴´�
/*
 *  String str="abcdef";
 *  char c=str.charAt(1);
 *  c��? => b! (���� �迭�̱� ������)
 */
import java.util.Scanner;
public class ���ڿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ� �Է�:");
		String data=scan.next();
		int count=0;
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i); //�ѱ��ھ� ������ ���� ��
			if(c=='a' || c=='A')
			{
				count++;
			}
		}
			System.out.println("a, A�� �� " + count+"��");
	}
	

}
