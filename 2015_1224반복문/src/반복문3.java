/*
 * up-down 게임
 */

import java.util.Scanner;
public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//임의 난수를 발생 => 1~100
		int com=(int)(Math.random()*100+1);
		int count=0;
		for(;;) //초기값도 없고 조건식도 없고, 무한루프일때
		{
			System.out.println("1~100까지 사이의 정수 입력 :");
			int user=scan.nextInt();
			if(user<1||user>100)
			{
				System.out.println("잘못된 입력입니다");
				continue;
			}
			count++;
			//비교
			if(com>user)
			{
				System.out.println("입력값보다 높은 수를 입력하세요");
			}
			else if(com<user)
			{
				System.out.println("입력값보다 낮은 수를 입력하세요");
			}
			else // ==
			{
				System.out.println("Game over!!");
				System.out.println("입력횟수점수:"+(100-count*10));
				break;
			}
		}
	}

}
