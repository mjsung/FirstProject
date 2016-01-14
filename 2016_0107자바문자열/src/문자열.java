/*
 * ���ڿ� ==> ���� ������ ��� ���
 * 		  ===============
 * 			char[] ==> �����ؼ� ���� Ŭ���� : String
 * 1) ��� ����
 * 		String ������ = "��";
 * 		====== ====
 * 		Ŭ����         ��ü	 ��ü������ => ��ü : ����� ���� ���������� ���� ������
 * 		String ������ = new String("��");
 * 					=====
 * 					���ο� �޸𸮸� ���� => ����
 * 					malloc() => free() ����� ����
 * 					new => System.gc() �츮�� ����� ��ü�� �̷���!
 * 		String str=new String("java");
 * 		�ڹ� �޸�
 * 		=====================================
 * 			method ����
 * 		=====================================
 * 			stack => �޸𸮿� ���� ����(��������, �Ű�����)
 * 		=====================================
 * 			head => �����ڰ� ����(new�� �̿��ؼ� �Ҵ�)
 * 		=====================================
 * 		{
 * 		String str=new String("java");
 * 		}
 * 		�������� : �迭, String (�ּҸ� �����ؼ� ��������!)
 * 			stack		heap(���� ����)
 * 		========== ==============
 * 			str		   (java)
 * 			100			100
 * 		========== ==============
 * 
 * 		String : ��������, ���
 * 		1) equals : ���ڿ� ��
 * 		2) length : ������ ����
 * 		3) substring : ���ڸ� ������ ��
 * 		4) split : ���� ����
 * 		5) startWith, endWith : �ڵ� �ϼ���(�տ������� ���� , �ڿ������� ����)
 * 		6) trim : �¿��� ������ ����
 * 		7) indexOf, lastIndexOf : ���ϴ� ��ġ�� ���� ��ġ
 * 		8) replace : �ٸ� ������ ����
 * 		9) valueOf : ��� ���������� ���ڿ��� ����
 * 		10) charAt(0) : �ش� ���ڿ����� ���� �� ���� ������ �� ��
 */
public class ���ڿ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		String str2=new String("Hello");
		if(str==str1)
		{
			System.out.println("str�� str1�� ����(�ּҰ�)");
		}
		if(str==str2)
		{
			System.out.println("str�� str2�� ����(�ּҰ�)");
		}
		else
		{			
				System.out.println("str�� str2�� �ٸ���(�ּҰ�)");
		}
		if(str.equalsIgnoreCase(str2)) //equals �� ���ڿ� ��, equalsIgnoreCase�� ��ҹ��� �����ϰ� ��
		{
			System.out.println("str�� str2�� ���ڿ��� ����");
		}
		else
		{			
				System.out.println("str�� str2�� ���ڿ��� �ٸ���");
		}
	}

}

















