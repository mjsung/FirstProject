//substring => 문자를 분리
/* 우편번호, 주민등록번호 등 숫자 자를 때 자주 사용
 * substring(int startIndex)
 * substring(3) ->3번부터 쭉~ 달라는 것 
 * substring(int startIndex, endIndex)
 * substring(3,7) -> 3번부터 6번까지 => endIndex는 -1
 */
import java.io.*;
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="0123456789";
		String res1=str.substring(3);
		System.out.println("res1="+res1);
		
		String res2=str.substring(3,7);
		System.out.println("res2="+res2);*/
		
		
		
		
		//파일리스트에서 확장자만 잘라내기 _ 확장자가 java인 것만 리스트 가져오기
		File dir=new File("C:\\Users\\aaa\\workspace\\2016_0106자바메소드\\src");
		File[] files=dir.listFiles();
		for(int i=0;i<files.length;i++)
		{
			//System.out.println(files[i].getName());
			String name=files[i].getName();
			String ext=name.substring(name.lastIndexOf('.')+1); //확장자만 잘라내기
			if(ext.equals("java"))
			{
				System.out.println(name);
			}
		}
	}

}
