/*
 산술연산자
 +, -, *, /, %
 +,-,* : 형변환
 10+20.5
 10.0 (큰 데이터형으로 변경 => 자동 형변환)
 10.0+20.5==> 30.5
 
 'A'+5 => 65+5=70
 
 int A=10.5=10.5;
 ===== ==========
   4	  8      =>error
   int a=(int)(10.5+10.5) ===> 21
   int a=(int)10.5+(int)10.5; ===> int가 먼저라서 10+10 = 20 
   
   / 
  1) 0으로 나누면 에러
  2) 정수와 정수를 나누면 정수가 나온다(정수/정수=정수)
     10/3==>3 (소수점이하를 제외하고 나옴)
     
  % : 결과값이 왼쪽부호가 남는다
  	5%2 = 1
  	-5%2 = -1
  	-5%-2= -1
  	5%-2 = 1
  
 */
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int kor=85;
		int eng=78;
		int math=81;
		int total=kor+eng+math;
		double avg=total/3.0; //3이 아니라 3.0으로 나눠야 실수가 나옴
		System.out.println("국어점수 :"+kor);
		System.out.println("영어점수 :"+eng);
		System.out.println("수학점수 :"+math);
		System.out.println("총점 :"+total);
		//System.out.println("평균 :"+avg);
		System.out.printf("vudrbs:%.2f",avg);
		//서식 : %c(문자), %d(정수), %f(실수), %s(문자열)*/
		
		System.out.println("5%2="+5%2); // *,/,% 가 +,-보다 우선순위
		System.out.println("5%2="+ -5%2);
		System.out.println("5%2="+5%-2);
		System.out.println("5%2="+ -5%-2);
	}

}
