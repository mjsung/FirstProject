//charAt : 문자열에서 원하는 문자를 한개 받는다
/*
 *  String str="abcdef";
 *  char c=str.charAt(1);
 *  c는? => b! (문자 배열이기 때문에)
 */
import java.util.Scanner;
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		String data=scan.next();
		int count=0;
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i); //한글자씩 가지고 오는 것
			if(c=='a' || c=='A')
			{
				count++;
			}
		}
			System.out.println("a, A는 총 " + count+"개");
	}
	

}
