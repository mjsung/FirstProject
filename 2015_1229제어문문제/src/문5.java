import java.util.Scanner;
public class 문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수 입력:");
		int kor=scan.nextInt();
		System.out.println("영어점수 입력:");
		int eng=scan.nextInt();
		double avg=(kor+eng)/2.0;
		if(avg>=90 && avg<=100)
			System.out.println("학점 : A");
		if(avg>=80 && avg<=89)
			System.out.println("학점 : B");
		if(avg>=70 && avg<=79)
			System.out.println("학점 : C");
		if(avg>=60 && avg<=69)
			System.out.println("학점 : D");
		if(avg<60)
			System.out.println("학점 : F");
	}

}
