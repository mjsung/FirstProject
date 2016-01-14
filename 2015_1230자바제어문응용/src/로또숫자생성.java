/*
 * 1~45까지 6개의 중복없는 난수 발생
 * 사용자가 6개 입력 ==>비교
 * 3-->4등
 * 4-->3등
 * 5-->2등
 * 6-->1등
 */
import java.util.Scanner;;
public class 로또숫자생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1=new int[6];
		int[] user=new int[6];
		//중복없는 난수
				int su=0; //난수 저장
				boolean bDash=false; //중복여부 확인
				for(int i=0;i<6;i++)
				{
					bDash=true; //for문 시작될때마다 true라고 다시 설정이 되어야 while문이 돌아감
					while(bDash)
					{
						//난수발생
						su=(int)(Math.random()*45)+1;
						bDash=false;
						for(int j=0;j<i;j++)
						{
							if(num1[j]==su)
							{
								bDash=true;
								break; //while문의 조건문으로 이동한다.
							}
						}
					}
					num1[i]=su;
				}
				//사용자입력
				Scanner scan=new Scanner(System.in);
				for(int i=0;i<6;i++)
				{
					System.out.print("1~45까지 정수를 입력:");
					int no=scan.nextInt();
					if(no<1 || no>45)
					{
						System.out.println("1~45까지 정수만 입력하세요");
						i--; //컨디뉴하면 잘못입력한 부분의 횟수가 오차가 나므로
						continue;
					}
					user[i]=no;
				}
				System.out.println("로또 당첨번호");
				for(int i=0;i<6;i++)
				{
					System.out.print(num1[i]+" ");
				}
				System.out.println();
				System.out.println("본인입력값");
				for(int i=0;i<6;i++)
				{
					System.out.print(user[i]+" ");
				}
				System.out.println();
				int count=0;
				for(int i=0;i<6;i++)
				{
					for(int j=0;j<6;j++)
					{
						if(num1[i]==user[j])
							count++;
					}
				}
				switch(count)
				{
				case 0:
				case 1:
				case 2:
					System.out.println("꽝");
					break;
				case 3:
					System.out.println("4등 당첨(5000원");
					break;
				case 4:
					System.out.println("3등 당첨(1,500,000원");
					break;
				case 5:
					System.out.println("2등 당첨(56,000,000원");
					break;
				case 6:
					System.out.println("1등 당첨(1조");
					break;
				}
		}
}
		

