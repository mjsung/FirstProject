//������ �߻� 5 => �ִ밪, �ּҰ�
public class �迭3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int[5];
		for(int i=0;i<score.length;i++)
		{
			score[i]=(int)(Math.random()*100)+1;
			
		}
		int max=0; // �ִ밪�� ���ؾ��ϴϱ� ���� ���������� �д�ū ���� ���ؼ� �ٲ�� �ϹǷ�!
		int min=100;// �ּҰ��� ���ؾ��ϴϱ� ���� ū���� �д�. �������� ���ؼ� �ٲ㳪���� ��.
		for(int i=0;i<score.length;i++){
			if(max<score[i])
				max=score[i];
			if(min>score[i])
				min=score[i];
		}
		System.out.println("����������");
		for(int i=0;i<score.length;i++)
		{
			System.out.print(score[i]+" ");
		}
		System.out.println();
			System.out.println("�ִ밪:"+max);
			System.out.println("�ּҰ�:"+min);
	}

}
