import java.util.Scanner;
public class ��5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�������� �Է�:");
		int kor=scan.nextInt();
		System.out.println("�������� �Է�:");
		int eng=scan.nextInt();
		double avg=(kor+eng)/2.0;
		if(avg>=90 && avg<=100)
			System.out.println("���� : A");
		if(avg>=80 && avg<=89)
			System.out.println("���� : B");
		if(avg>=70 && avg<=79)
			System.out.println("���� : C");
		if(avg>=60 && avg<=69)
			System.out.println("���� : D");
		if(avg<60)
			System.out.println("���� : F");
	}

}
