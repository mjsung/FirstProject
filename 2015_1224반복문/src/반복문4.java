/*
 * for
 * ����)
 * 	for(�ʱ�ȭ;���ǽ�;������)
 * 	{
 * 		���๮��1
 * 		���๮��2
 * 	}
 * 
 * ���� ���� : �ʱ�ȭ -> ���ǽ� -> ���๮��1 -> ���๮��2 ->������ -> ���ǽ� -> ���๮�� 1 ->�ݺ�~~
 *					-> (�׷��� ���ǽ��� false �� �� ����)
 *	 
 * **1~10���� �����ٰ� ���� �� 
 * 5�� �� break -> 1,2,3,4
 * 5�� �� continue -> 1,2,3,4,6,7,8,9,10
 *
 */
//1-2+3-4+5-6+7-8+9-10 (Ȧ���� �� ���ϰ�, ¦���� �� ����-������ ����(����))

//for���� �� int�� �����ϴ� ���� �ƴ϶� char�� �� ���� �ְ� double�� �� ���� �ִ�

public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int value=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)
				value+=i;
			else
				value-=i;
		}
		System.out.println(value);*/
		
		char a=0;
		for(char i='A';i<='Z';i++)
			//System.out.print(i+" ");
		{
			System.out.print((char)(i+32)); //�ҹ��ڷ� ���
			}
	}

}
