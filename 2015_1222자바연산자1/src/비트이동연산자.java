/*
 * ���α׷� ���� ���
 *  1) ������ ���� => ����
 *  2) ������ ����ó�� => ������
 *  3) ó���� ��� ��� => System.out.println()
 *     => System.out.println() : new Line
 *        System.out.println("abc");
 *        System.out.println("def");
 *        abc
 *        def
 *        System.out.print() : �̾ ���
 *        System.out.println("abc");
 *        System.out.println("def");
 *        abcdef 
 *        System.out.printf() : ������ ������ �ִ� ���
		  System.out.println("%5d%5d%5d",10,20,30)->5�� 5ĭ ����, �� 3ĭ����� �Ҹ�
		  10   20   30 
 *  		* 5d�� ���� ����, -5d�� �ڸ� ����
 * 
 * 		��Ʈ�̵������� (<< �����̵�, >> �������̵�)
 * 		10<<2 ==> ���������� ��ȯ �Ŀ� �ڿ� 0�� 2�� �ٿ���
 * 		10 => 1010 (101000)
 *  	     x<<y => x*2^y
 * 		10>>2 ==> ���������� ��ȯ �Ŀ� �ڿ��� 2�� ����
 * 		10 => 10(10)X ==10(2)
 * 		x>>y => x/2^y
 * 
*/     

public class ��Ʈ�̵������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.printf("%-5d%-5d", 10,20);
		
	int a=10;
	int b=2;
	/*
	 * 	  1010
	 * 	1010(00)
	 * 	  1010
	 *  	10(10)
	 */
	int c=a<<b;
	int d=a>>b;
	System.out.println(Integer.toBinaryString(a));
	//2������ ������
	System.out.println("c=" +c);
	System.out.println("d="+d);
	}

}
