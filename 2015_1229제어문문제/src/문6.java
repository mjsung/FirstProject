import java.util.Scanner;
public class ��6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�������� �Է�:");
		int kor=scan.nextInt();
		System.out.println("�������� �Է�:");
		int eng=scan.nextInt();
		int avg=(int)(kor+eng)/2;
		
		switch(avg/10)
		{
			case 10:
			case 9:
				System.out.println("���� : A");
				break;
			case 8:
				System.out.println("���� : B");
				break;
			case 7:
				System.out.println("���� : C");
				break;
			case 6:
				System.out.println("���� : D");
				break;
			default:
				System.out.println("���� : F");
								}
	}

}
