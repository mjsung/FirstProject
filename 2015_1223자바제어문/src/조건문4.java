/*
 * 
 * 
 */
import java.util.Scanner;
public class ���ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�������� �Է�:");
		int kor=scan.nextInt();
		System.out.println("�������� �Է�:");
		int math=scan.nextInt();
		System.out.println("�������� �Է�:");
		int eng=scan.nextInt();
		//����
		/*int total=kor+math+eng;
		//���(�������� �Ǽ��� ������ 3.0)
		double avg=total/3.0; 
		//���
		System.out.println("����:"+total);
		System.out.println("���:%.2f",avg);*/
		
		if(kor>=90 && kor<=100)
			System.out.println("��������:A");
		if(kor>=80 && kor<=90)
			System.out.println("��������:B");
		if(kor>=70 && kor<=80)
			System.out.println("��������:C");
		if(kor>=60 && kor<=70)
			System.out.println("��������:D");
		if(kor<60)
			System.out.println("��������:F");
	}

}
