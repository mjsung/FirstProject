//������3�� �Է¹޾Ƽ� => �������
/*
 * ������ 3��
 * ������ �Ű�����
 * int[]  x
 * ���� ���
 * ������ �Ű�����
 * char int[]
 */
import java.util.Scanner;
public class �޼ҵ�4 {
//�Է�
	static int[] input()
	{
		Scanner scan=new Scanner(System.in);
		int[] score=new int[3];
		System.out.print("��������:");
		score[0]=scan.nextInt();
		
		System.out.print("��������:");
		score[1]=scan.nextInt();
		
		System.out.print("��������:");
		score[2]=scan.nextInt();
		
		return score;
	}
	static int scoreTotal(int[] score)
	{
		int total=0;
		for(int i=0;i<score.length;i++)
		{
			total+=score[i];
		}
		return total;
	}
	static char getHakjum(int total)
	{
		char hak='A';
		switch(total/30)
		{
		case 10:
		case 9:
			hak='A';
			break;
		case 8:
			hak='B';
			break;
		case 7:
			hak='C';
			break;
		case 6:
			hak='D';
			break;
			default:
				hak='F';
		}
		return hak;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=input();
		int total=scoreTotal(score);
		char hak=getHakjum(total);
		System.out.println("����:" +hak);
	}

}
