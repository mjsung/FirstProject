//1~100 ¦���� ����, Ȧ���� ����
//****������� : for, while, do~while���� �������� ����?
	//for�� �ݺ� Ƚ�� ����, while�� �ݺ�Ƚ���� ������ ����, ������, do~while���� �ݵ�� �ѹ� �̻� �����̸� ������
public class ��3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0;
		int odd=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				even++;
			else
				odd++;
				
		}
		System.out.println("¦���� ������:"+even);
		System.out.println("Ȧ���� ������:"+odd);
		/*
		 * ���׿�����
		 *  = ����������(++,--)
		 *    ++a: ���� �����Ŀ� �ٸ� ���� ���� / a++: �ٸ� ���� ���� �� �����Ѵ�
		 *  = ���������� (!): boolean
		 */
	}

}
