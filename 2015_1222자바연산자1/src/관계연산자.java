/*
 * ���迬���� => ������� true/false - boolean
 * 		== ����  (*******) -> =(�����ϴ�)
 * 		!= �����ʴ�
 * 		<  �۴�
 * 		>  ũ��
 * 		<= �۰ų� ����
 * 		>= ũ�ų� ����
 */


public class ���迬���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		int b=9;
		boolean result=(a==++b);//10
		System.out.println("b="+b);
		System.out.println("result="+result);
		result=(a==b++); //10
		System.out.println("b="+b);//11
		System.out.println("result="+result);
		result=(a==b); //11
		System.out.println("b="+b);
		System.out.println("result="+result);*/
		
		int a=10;
		int b=9;
		boolean result=(a!=b); //true
		System.out.println("result="+result);
		b++;
		result=(a!=b); //false
		System.out.println("result="+result);
	}

}
