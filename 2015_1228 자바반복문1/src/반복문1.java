/*
 * 반복문
 * = for : 지정된 횟수
 * 	 형식)
 * 		for(초기값;조건식;증가식)
 * 			실행문장
 * 		초기값-조건식-실행문장-증가식-조건식-실행문장-증가식-반복하다가 조건식이 false면 종료
 * 		for(int i=1;i<=10;i++)
 * 		{
 * 			System.out.println("i =" +i);
 * 		}
 * 		for(;;) => 무한루프(break)
 * = while : 지정이 없는 횟수
 * 	 형식)
 * 		초기값
 * 		while(조건식)
 * 		{
 * 			실행문장;
 * 			증가식;
 * 		}
 * 		초기값-조건식-실행문장-증가식-반복하다가 조건식이 false면 종료
 * 		int i=1;
 * 		while(i<=10)
 * 		{
 * 		System.out.println("i="+i);
 * 		i++;
 * 		}
 * 		*while문 무한루프
 * 		while(true)
 *		{
 *		}  => break
 * = do~while : 한번 이상 수행
 * 	 형식)
 * 		초기값
 * 		do
 * 		(
 * 			반복수행문장;
 * 			증가식;
 * 		}while(조건식); =>
 *		초기값-반복수행문장-증가식
 *		int i=1;
 *		do
 *		{
 *			System.out.println("i="+i);
 *			i++;
 *		}while(i<=10);
 * 
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("For문 수행");
			for(int i=1;i<=10;i++)
			{
				System.out.print(i+"\t"); //print는 가로로 나옴, println은 세로로 나옴(다음줄에 내려쓰라고 하는 것)
			}
			System.out.println();
			System.out.println("while문 수행");
			int i=1;
			while(i<=10)
			{
				System.out.print(i+"\t"); //\t는 tab(일정간격)
				i++;
			}
			System.out.println(); // ln => \n (new line) 다음줄에 출력
			System.out.println("do~while문 수행");
			i=1;
			do
			{
				System.out.print(i+"\t");
				i++;
			}while(i<=10);
	}

}
