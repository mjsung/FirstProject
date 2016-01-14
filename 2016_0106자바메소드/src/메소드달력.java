/*
 * 	1) �⵵, �� �Է�
 * 	2) ��û�� �޿� 1������ ����
 * 		=> 1. 1�� 1��~�Է��� ���� 1�� => �ѳ���
 * 		=> 2. ����
 * 		=> 3. �� ���� ������ ��¥
 *  3) 1�� ���
 */
import java.util.Scanner;
public class �޼ҵ�޷� {
	//�Է�
	static int dayInput()
	{
		Scanner scan=new Scanner(System.in);
		return scan.nextInt();
	}
	//����
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0)||(year%400==0))
			bCheck=true;
		return bCheck;
	}
	//�� ���� ������ ��
	static int lastDay(int year, int month)
	{
		int[] day={31,28,31,30,31,30,31,31,30,31,30,31};
		if(isYear(year))
			day[1]=29;
		else
			day[1]=28;
		return day[month-1];
	}
	// ������ ���Ѵ�
	static int getWeek(int year,int month)
	{
		int week=0;
		//���⵵������ �� ������ ���Ѵ�
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		//����(���� ���� ���ԵǸ� �ȵǼ� <=�� �ƴ϶� <)
		for(int i=0;i<month;i++)
		{
			total+=lastDay(year,month);
		}
		total++;
		week=total%7;
		return week;
	}
	static void dayPrint(int year, int month)
	{
		System.out.println(year+"�⵵"+month+"��");
		char[] strWeek={'��','��','ȭ','��','��','��','��'};
		for(int i=0; i<7;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		int week=getWeek(year,month);
		int last=lastDay(year,month);
		for(int i=1;i<=last;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t"); //1�� ������ ������ ���
				}
			}
			System.out.printf("%2d\t",i); 
			week++;
			if(week>6)
				{
				System.out.println(); //����Ͽ��� ���� �����ٷ� ������
				week=0;
				}
		}
	}
	//����
	static void process()
	{
		System.out.print("�⵵ �Է� : ");
		int year = dayInput();
		System.out.print("�� �Է� : ");
		int month = dayInput();
		dayPrint(year, month);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
