import java.util.Scanner;
public class new_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� Math.random() => 0.0~0.99
		int a=(int)(Math.random()*100);
		int b=(int)(Math.random()*100);
		
		System.out.println("������ ���纸����");
		System.out.println(a+"+"+b);
		Scanner scan=new Scanner(System.in);
		int user=scan.nextInt();
		
		if(user==a+b)
		{
			System.out.println((a+b)+"/ �����Դϴ�");
		}
		else
		{
			System.out.println("������\n"+(a+b)+"/ �ٽ� Ǯ�����");
		}
			
	}

}
