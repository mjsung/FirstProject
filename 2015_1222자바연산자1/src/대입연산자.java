/*
 * ���Կ�����
 * 
 *  =
 *  +=
 *  -=
 *  *=
 *  /=
 *  op=
 * 
 *  int a=10;
 *  a+=1  a=a+1
 *  a-=1  a=a-1
 *  a*=3  a=a*3
 *  a/=3  a=a/3
 *  �Ѱ� ���� �� ��� => ++a, a++, a=a+1, a+=1
 */

public class ���Կ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		a+=5; //a=15
		System.out.println("a="+a);
		a-=5; //a=10
		System.out.println("a="+a);
		a*=2; //a=20 
		System.out.println("a="+a);
		a/=3; //a=6 a=20/3
		System.out.println("a="+a);
		a<<=2; //a=24  a=a<<2 ==> 6<<2
		System.out.println("a="+a);
		a>>=3; //a=3  a=a>>3 == 3 24/2^3
		System.out.println("a="+a);
	}

}
