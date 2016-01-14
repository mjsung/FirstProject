//1~100 짝수의 개수, 홀수의 개수
//****기술문제 : for, while, do~while문의 차이점이 뭔가?
	//for는 반복 횟수 지정, while은 반복횟수가 지정이 없고, 선조건, do~while문은 반드시 한번 이상 수행이며 후조건
public class 문3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0;
		int odd=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				even++;
			else
				odd++;
				
		}
		System.out.println("짝수의 개수는:"+even);
		System.out.println("홀수의 개수는:"+odd);
		/*
		 * 단항연산자
		 *  = 증감연산자(++,--)
		 *    ++a: 먼저 증가후에 다른 연산 수행 / a++: 다른 연산 수행 후 증가한다
		 *  = 부정연산자 (!): boolean
		 */
	}

}
