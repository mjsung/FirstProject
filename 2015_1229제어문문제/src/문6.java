import java.util.Scanner;
public class 문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수 입력:");
		int kor=scan.nextInt();
		System.out.println("영어점수 입력:");
		int eng=scan.nextInt();
		int avg=(int)(kor+eng)/2;
		
		switch(avg/10)
		{
			case 10:
			case 9:
				System.out.println("학점 : A");
				break;
			case 8:
				System.out.println("학점 : B");
				break;
			case 7:
				System.out.println("학점 : C");
				break;
			case 6:
				System.out.println("학점 : D");
				break;
			default:
				System.out.println("학점 : F");
								}
	}

}
