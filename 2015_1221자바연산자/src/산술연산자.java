/*
 ���������
 +, -, *, /, %
 +,-,* : ����ȯ
 10+20.5
 10.0 (ū ������������ ���� => �ڵ� ����ȯ)
 10.0+20.5==> 30.5
 
 'A'+5 => 65+5=70
 
 int A=10.5=10.5;
 ===== ==========
   4	  8      =>error
   int a=(int)(10.5+10.5) ===> 21
   int a=(int)10.5+(int)10.5; ===> int�� ������ 10+10 = 20 
   
   / 
  1) 0���� ������ ����
  2) ������ ������ ������ ������ ���´�(����/����=����)
     10/3==>3 (�Ҽ������ϸ� �����ϰ� ����)
     
  % : ������� ���ʺ�ȣ�� ���´�
  	5%2 = 1
  	-5%2 = -1
  	-5%-2= -1
  	5%-2 = 1
  
 */
public class ��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int kor=85;
		int eng=78;
		int math=81;
		int total=kor+eng+math;
		double avg=total/3.0; //3�� �ƴ϶� 3.0���� ������ �Ǽ��� ����
		System.out.println("�������� :"+kor);
		System.out.println("�������� :"+eng);
		System.out.println("�������� :"+math);
		System.out.println("���� :"+total);
		//System.out.println("��� :"+avg);
		System.out.printf("vudrbs:%.2f",avg);
		//���� : %c(����), %d(����), %f(�Ǽ�), %s(���ڿ�)*/
		
		System.out.println("5%2="+5%2); // *,/,% �� +,-���� �켱����
		System.out.println("5%2="+ -5%2);
		System.out.println("5%2="+5%-2);
		System.out.println("5%2="+ -5%-2);
	}

}
