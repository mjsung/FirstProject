/*
 * ����if
 * 	if(���ǹ�)
 * 	  ����1
 * 
 * 	if(���ǹ�)
 * 	 ����1
 * 	 ����2
 * 
 * 	if(���ǹ�)
 * 	{
 * 		����1
 * 		����1
 * 	}
 * 
 */
public class ���ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a'; //char ==> �����ڰ� ���� ������ �ٲ�
		/*
		 * && : ����, || : ������ ��� ���
		 * 
		 * 1) !
		 * 2) ���迬����
		 * 3) ��������
		 */
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"��(��) �빮�ڴ�");
		/*if(ch>='a' && ch<='z')
			System.out.println(ch+"��(��) �ҹ��ڴ�");*/
		if(!(ch>='A' && ch<='Z'))
			System.out.println(ch+"��(��) �ҹ��ڴ�");
	}

}
