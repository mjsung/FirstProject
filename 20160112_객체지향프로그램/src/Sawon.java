/*
 * 	Ŭ������ ����
 * class class_name
 * {
 * 		�������� => ��������(Ŭ���� �������)
 * 		�޼ҵ� ����
 * 		main()
 * 		{
 * 		}
 * }
 * 	Ŭ������ �������
 *		1) ����
 *		2) �޼ҵ� => ������+���
 *		3) 
 */
public class Sawon {
	static int sabun; //����=> ������(���뺯��)
	String name; //��ü���� => ��ü�� �����ø��� ���� ���� ����
	String dept;
	String loc;
	long pay;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s=new Sawon();
		//s=> name, dept,loc,pay
		System.out.println("s="+s);
		s.sabun=10;
		s.name="ȫ�浿";
		Sawon s2=s;
		System.out.println("s2="+s2);
		Sawon s1=new Sawon();
		//s1=> name, dept,loc,pay
		System.out.println("s1="+s1);
		s.sabun=20;
		s1.name="��û��";
		s2.name="������";
		System.out.println("s.sabun:"+s.sabun);
		System.out.println("s.name:"+s.name);
	}

}
