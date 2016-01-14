import java.util.Scanner;

/*
 *  1) 중복없는 난수 => int[] com 3개
 *  2) 입력  	   => int[] user
 *  3) 비교	   => s, b
 *  4) 힌트 	   => s, b 보여주기
 *  5) 종료	   => s==3	
 */
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];
		int[] user=new int[3];
		int s;
		int b;
		//중복없는 난수
		int su=0; //난수 저장
		boolean bDash=false; //중복여부 확인
		for(int i=0;i<3;i++)
		{
			bDash=true; //for문 시작될때마다 true라고 다시 설정이 되어야 while문이 돌아감
			while(bDash)
			{
				//난수발생
				su=(int)(Math.random()*9)+1;
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bDash=true;
						break; //while문의 조건문으로 이동한다.
					}
				}
			}
			com[i]=su;
		}
		
	/*	/*for(int i=0;i<3;i++)
		{
		System.out.print(com[i]+" ");
		}*/ // 일단 숫자 랜덤이 돌아가는지 출력해봄. 게임에는 들어가지않으므로 주석!
		//주석
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			//사용자 입력
			System.out.println("세자리 정수 입력:");
			int input=scan.nextInt();
			//오류처리
			if(input<100 || input>999)
			{
				System.out.println("세자리 정수만 입력해야 합니다");
				continue;
				/*
				 * continue는!!
				 * for -> 증가식으로 감
				 * while문일 때 -> 조건식으로 감
				 */
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("중복된 수는 사용할 수 없다");
				continue;
			}
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0은 사용할 수 없다");
				continue;
			}
			//비교
			s=0;
			b=0;
			for(int i=0;i<3;i++) //com
			{
				for(int j=0;j<3;j++)//user
				{
					if(com[i]==user[j])//비교 => 같은 수가 있다면
					{
						if(i==j)//같은 자리인지
							s++;
						else
							b++;
					}
				}
			}
			//힌트
			System.out.printf("Input Number : %d, Result:%dS-%B\n",input,s,b);
		
			//종료
			
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}
	}
}

