import java.util.Scanner;
public class 문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수는 같은 블럭상에서 중복된 이름을 사용할 수 없다.
		//블록안에서만 변수가 사용됨. 블록 밖에서는 사용 불가능 -> 지역변수라고 함
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수 입력:");
		int kor=scan.nextInt();
		System.out.println("수학점수 입력:");
		int math=scan.nextInt();
		System.out.println("영어점수 입력:");
		int eng=scan.nextInt();
		int total=kor+math+eng;
		double avg=total/3.0; 
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f",avg);
	}

}
