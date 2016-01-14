/*
 * startsWith
 * endsWith => boolean
 */
import java.util.Scanner;
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data={
				"java program",
				"java and jsp",
				"ajax and html",
				"oracle and java",
				"oracle program"
		};
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어:");
		String find=scan.next();
		for(int i=0;i<data.length;i++)
		{
			if(data[i].startsWith(find)||data[i].endsWith(find))
			{
			System.out.println(data[i]);
			}
		}
	}

}
