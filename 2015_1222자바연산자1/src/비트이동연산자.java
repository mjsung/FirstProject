/*
 * 프로그램 구현 방법
 *  1) 데이터 저장 => 변수
 *  2) 데이터 연산처리 => 연산자
 *  3) 처리된 결과 출력 => System.out.println()
 *     => System.out.println() : new Line
 *        System.out.println("abc");
 *        System.out.println("def");
 *        abc
 *        def
 *        System.out.print() : 이어서 출력
 *        System.out.println("abc");
 *        System.out.println("def");
 *        abcdef 
 *        System.out.printf() : 서식을 가지고 있는 출력
		  System.out.println("%5d%5d%5d",10,20,30)->5는 5칸 차지, 즉 3칸띄우라는 소리
		  10   20   30 
 *  		* 5d는 앞을 띄우고, -5d는 뒤를 띄운다
 * 
 * 		비트이동연산자 (<< 왼쪽이동, >> 오른쪽이동)
 * 		10<<2 ==> 이진법으로 변환 후에 뒤에 0을 2개 붙여라
 * 		10 => 1010 (101000)
 *  	     x<<y => x*2^y
 * 		10>>2 ==> 이진법으로 변환 후에 뒤에서 2개 제외
 * 		10 => 10(10)X ==10(2)
 * 		x>>y => x/2^y
 * 
*/     

public class 비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.printf("%-5d%-5d", 10,20);
		
	int a=10;
	int b=2;
	/*
	 * 	  1010
	 * 	1010(00)
	 * 	  1010
	 *  	10(10)
	 */
	int c=a<<b;
	int d=a>>b;
	System.out.println(Integer.toBinaryString(a));
	//2진법을 보여줌
	System.out.println("c=" +c);
	System.out.println("d="+d);
	}

}
