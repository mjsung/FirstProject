import java.util.Scanner;

public class 학점계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] dap=new char[10];
		char[] user=new char[10];
		for(int i=0;i<10;i++)
		{
			int rnd=(int)(Math.random()*2);
			if(rnd==0)
				dap[i]='O';
			else
				dap[i]='X';
		}
		/*for(int i=0;i<10;i++)
		{
			System.out.print(dap[i]+"  ");
		}*/
		//입력
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.print("0(O), 1(X) : ");
			int num=scan.nextInt();
			
			if(num==0)
				user[i]='O';
			else if(num==1)
				user[i]='X';
			else 
				user[i]='Y';
		
		}
		//비교
		int count=0;
		for(int i=0;i<10;i++)
		{
			if(dap[i]==user[i])
				count++;
		}
		//비교
		for(int i=0;i<10;i++)
		{
			System.out.print(dap[i]+" ");
		}
		System.out.println();
		for(int i=0;i<10;i++)
		{
			System.out.print(user[i]+" ");
		}
		System.out.println();
		System.out.println("점수:"+(count*10));
		char hak='A';
		switch(count)
		{
		case 10:
		case 9:
			hak='A';
			break;
		case 8:
			hak='B';
			break;
		case 7:
			hak='C';
			break;
		case 6:
			hak='D';
			break;
		default:
			hak='F';
			
		}
		System.out.println("학점:"+hak);
	}
}
