import java.util.Scanner;
public class ��1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ���� ���󿡼� �ߺ��� �̸��� ����� �� ����.
		//��Ͼȿ����� ������ ����. ��� �ۿ����� ��� �Ұ��� -> ����������� ��
		Scanner scan=new Scanner(System.in);
		System.out.println("�������� �Է�:");
		int kor=scan.nextInt();
		System.out.println("�������� �Է�:");
		int math=scan.nextInt();
		System.out.println("�������� �Է�:");
		int eng=scan.nextInt();
		int total=kor+math+eng;
		double avg=total/3.0; 
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
		System.out.println("����:"+math);
		System.out.println("����:"+total);
		System.out.printf("���:%.2f",avg);
	}

}
