/*
 * for
 * 형식)
 * 	for(초기화;조건식;증가식)
 * 	{
 * 		실행문장1
 * 		실행문장2
 * 	}
 * 
 * 실행 순서 : 초기화 -> 조건식 -> 실행문장1 -> 실행문장2 ->증가식 -> 조건식 -> 실행문장 1 ->반복~~
 *					-> (그러나 조건식이 false 일 때 종료)
 *	 
 * **1~10까지 돌린다고 했을 때 
 * 5일 때 break -> 1,2,3,4
 * 5일 때 continue -> 1,2,3,4,6,7,8,9,10
 *
 */
//1-2+3-4+5-6+7-8+9-10 (홀수일 때 더하고, 짝수일 때 빼기-패턴이 있음(수열))

//for문은 꼭 int로 시작하는 것이 아니라 char이 될 수도 있고 double이 될 수도 있다

public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int value=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)
				value+=i;
			else
				value-=i;
		}
		System.out.println(value);*/
		
		char a=0;
		for(char i='A';i<='Z';i++)
			//System.out.print(i+" ");
		{
			System.out.print((char)(i+32)); //소문자로 출력
			}
	}

}
