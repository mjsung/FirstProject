import java.util.Scanner;
//���� �Է¹޾Ƽ� ==> ������ ���
/*
 *  ���� �Է� ==> ������ ����(�Ű������� ���� �������� ����)
 *  ������ ��� ==> ����� ����(�������� ���� �Ű������� ����)
 */
public class �޼ҵ�7 {
	static int danInput()
	{
		return (int)(Math.random()*8)+2; //2~9���� �߻�
	}
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=danInput();
		gugudan(dan);
	}

}
