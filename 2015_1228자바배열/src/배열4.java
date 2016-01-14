/*
 * 년 월 일을 받아서 해당 요일을 계산
 * 1) 윤년 조건
 * 2) 총날수1.1.1 ==>2015.12.28 => %7
 *
 */
import java.util.Scanner;
public class 배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		
		System.out.println("월 입력:");
		int month=scan.nextInt();
		
		System.out.println("일 입력:");
		int day=scan.nextInt();
		//전년도
		int total=(year-1)*365
				   +(year-1)/4 //윤년마다 4년에 한번씩
				   -(year-1)/100 // 100년마다 한번씩은 아님
				   +(year-1)/400; //400년마다 한번씩
	int [] lastDay={
			31,28,31,30,31,30,
			31,31,30,31,30,31
	};
	if((year%4==0 && year%100!=0)||(year%400==0))
	{
		lastDay[1]=29;//윤년일때 2월 은 28일이 아니라 29일
	}
	else
		lastDay[1]=28;
	//2015 12 28
	for(int i=0;i<month-1;i++)
	{
		total+=lastDay[i];
	}
	total+=day;
	int week=total%7;
	char[] strWeek={'일','월','화','수','목','금','토'};
	//System.out.println(strWeek[week]+"요일");
	System.out.println(year+"년도"+month+"월");
	for(int i=0;i<7;i++)
	{
		System.out.print(strWeek[i]+"\t");
	}
	System.out.println();
	for(int i=1;i<=lastDay[month-1];i++)
	{
		if(i==1)
		{
			for(int j=0;j<week;j++)
			{
			System.out.print("\t");
			}
		}
		System.out.print(i+"\t");
		week++;
		if(week>6)
		{
			System.out.println();
			week=0;
		}
	}
	/*switch(week)
	{
	case 0:
		System.out.println("일요일입니다");
		break;
	case 1:
		System.out.println("월요일입니다");
		break;
	case 2:
		System.out.println("화요일입니다");
		break;
	case 3:
		System.out.println("수요일입니다");
		break;
	case 4:
		System.out.println("목요일입니다");
		break;
	case 5:
		System.out.println("금요일입니다");
		break;
	case 6:
		System.out.println("토요일입니다");
		break;
	}*/
	}
	
	
}
