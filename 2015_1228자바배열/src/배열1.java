/*
 * �迭
 *  = ���� ���������� ������ ��Ƽ� ����
 * 		����(�ѿ���), �迭(����Ʈ)
 *  = �Ϲ� ���� : ����(5)
 *    ������ 5�� int a=1, int b=2, int c=3, int d=4, int e=5
 *    �迭�� 1���� �迭������ ������ ������ ó��
 *    ���������� �޸𸮸� ��ġ�ϱ� ������ ������ ����
 *    
 *    1) ����
 *    	int[] �迭��={1,2,3,4,5};
 *     ��������
 *     	int[] a={1,2,3,4,5}
 *     ===========================
 *          1	2	3	4	5
 *     ===========================
 *      a[0] a[1] a[2] a[3] a[4] ==> �Ϲ� ������ ����
 *     
 */
public class �迭1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=(int)(Math.random()*45+1);
		int a2=(int)(Math.random()*45+1);
		int a3=(int)(Math.random()*45+1);
		int a4=(int)(Math.random()*45+1);
		int a5=(int)(Math.random()*45+1);
		int a6=(int)(Math.random()*45+1);
		System.out.println("ù��°��ȣ:"+a1);
		System.out.println("�ι�°��ȣ:"+a2);
		System.out.println("����°��ȣ:"+a3);
		System.out.println("�׹�°��ȣ:"+a4);
		System.out.println("�ټ���°��ȣ:"+a5);
		System.out.println("������°��ȣ:"+a6);
		
		int[] arr=new int[6]; //0���� �ʱ�ȭ
		for(int i=0;i<6;i++)//0������ �����ϱ⶧���� <=6�� �ƴ϶� <6���� �� ����ؾ���!
		{
			arr[i]=(int)(Math.random()*45+1);
			System.out.println(arr[i]);
		}
	}

}
