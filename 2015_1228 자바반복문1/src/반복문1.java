/*
 * �ݺ���
 * = for : ������ Ƚ��
 * 	 ����)
 * 		for(�ʱⰪ;���ǽ�;������)
 * 			���๮��
 * 		�ʱⰪ-���ǽ�-���๮��-������-���ǽ�-���๮��-������-�ݺ��ϴٰ� ���ǽ��� false�� ����
 * 		for(int i=1;i<=10;i++)
 * 		{
 * 			System.out.println("i =" +i);
 * 		}
 * 		for(;;) => ���ѷ���(break)
 * = while : ������ ���� Ƚ��
 * 	 ����)
 * 		�ʱⰪ
 * 		while(���ǽ�)
 * 		{
 * 			���๮��;
 * 			������;
 * 		}
 * 		�ʱⰪ-���ǽ�-���๮��-������-�ݺ��ϴٰ� ���ǽ��� false�� ����
 * 		int i=1;
 * 		while(i<=10)
 * 		{
 * 		System.out.println("i="+i);
 * 		i++;
 * 		}
 * 		*while�� ���ѷ���
 * 		while(true)
 *		{
 *		}  => break
 * = do~while : �ѹ� �̻� ����
 * 	 ����)
 * 		�ʱⰪ
 * 		do
 * 		(
 * 			�ݺ����๮��;
 * 			������;
 * 		}while(���ǽ�); =>
 *		�ʱⰪ-�ݺ����๮��-������
 *		int i=1;
 *		do
 *		{
 *			System.out.println("i="+i);
 *			i++;
 *		}while(i<=10);
 * 
 */
public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("For�� ����");
			for(int i=1;i<=10;i++)
			{
				System.out.print(i+"\t"); //print�� ���η� ����, println�� ���η� ����(�����ٿ� ��������� �ϴ� ��)
			}
			System.out.println();
			System.out.println("while�� ����");
			int i=1;
			while(i<=10)
			{
				System.out.print(i+"\t"); //\t�� tab(��������)
				i++;
			}
			System.out.println(); // ln => \n (new line) �����ٿ� ���
			System.out.println("do~while�� ����");
			i=1;
			do
			{
				System.out.print(i+"\t");
				i++;
			}while(i<=10);
	}

}
