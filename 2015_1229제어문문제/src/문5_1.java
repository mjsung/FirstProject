/*
 * 3���� ����, ����, ���������� �Է¹޾Ƽ�
 * ����, ���, ����, ����� ���ؼ� ���
 * ==========================
 *  ����  ����  ����  ����  ���  ����  ���
 *  90 =
 *  80 =
 *  70 =
 *  
 *  �迭(array)
 *  => �������� �޸� ��ġ
 *  => ���� ���������� ��Ƽ� ���� **
 *  ����)
 *  	��������[] �迭��; //�����Ҷ� �� ==> ��������
 *  	�������� �迭��[]; //���� �Ͱ� ������ c��� ����
 *  
 *  	��)
 *   	int[] a;
 *   	a=new int[5] =>������ 5�� ���ڸ� ��������! �ʱⰪ�� 0! �� ���ڸ��� int�ϱ� 4����Ʈ��! �׷��� �� 20����Ʈ
 *   					�����ϴ� ���� 100�̱� ������ a�� 100! 
 *   					a[0] => a+0 => 100+0�� ���� / a[1] => a+4
 *   
 *   	��)
 *   		int[] a={1,2,3,4,5};
 *   		a[0]=10 //�׷��� 1�� 10���� �ٲ�
 *   		
 */

import java.util.Scanner;
public class ��5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3]; //�������� 3�� ����  -> new�ϱ� 0�� �ʱ�ȭ //�迭�� ���� : ������ 3���̸� �� �߰��� �ȵ�
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hak=new char[3];
		int[] rank=new int[3];
		//int[][] jumsu=new in[3][7]; -> ���� 2�����迭�� �ȹ���⶧���� �ϴ� 7�ٷ�.
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.printf("%d��° �������� �Է�:",(i+1));
			kor[i]=scan.nextInt(); //�޾Ƽ� �����϶�� ��
			System.out.printf("%d��° �������� �Է�:",(i+1));
			eng[i]=scan.nextInt(); //�޾Ƽ� �����϶�� ��
			System.out.printf("%d��° �������� �Է�:",(i+1));
			math[i]=scan.nextInt(); //�޾Ƽ� �����϶�� ��
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		//���
		for(int i=0;i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		//����
		char score='A';
		for(int i=0;i<3;i++)
		{
			switch((int)(avg[i]/10))
			{
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
				
			}
			hak[i]=score;
		}
		System.out.printf("%10s%10s%10s%12s%18s%10s%10s\n","����","����","����","����","���","����","���"); 
		//%s�� ���� ���ڸ� ������� ��, s���� ���ڴ� ������ �ذ�.
		for(int i=0;i<3;i++)
		{
			System.out.printf("%5d%5d%5d%5d%10.2f%5c%5d\n", //%f�� �Ǽ��̱⶧���� %d�� �ƴ϶� f, char�� c������
					kor[i],eng[i],math[i],total[i],avg[i],hak[i],rank[i]);
		}

		
	}

}
