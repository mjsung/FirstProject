//substring => ���ڸ� �и�
/* �����ȣ, �ֹε�Ϲ�ȣ �� ���� �ڸ� �� ���� ���
 * substring(int startIndex)
 * substring(3) ->3������ ��~ �޶�� �� 
 * substring(int startIndex, endIndex)
 * substring(3,7) -> 3������ 6������ => endIndex�� -1
 */
import java.io.*;
public class ���ڿ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="0123456789";
		String res1=str.substring(3);
		System.out.println("res1="+res1);
		
		String res2=str.substring(3,7);
		System.out.println("res2="+res2);*/
		
		
		
		
		//���ϸ���Ʈ���� Ȯ���ڸ� �߶󳻱� _ Ȯ���ڰ� java�� �͸� ����Ʈ ��������
		File dir=new File("C:\\Users\\aaa\\workspace\\2016_0106�ڹٸ޼ҵ�\\src");
		File[] files=dir.listFiles();
		for(int i=0;i<files.length;i++)
		{
			//System.out.println(files[i].getName());
			String name=files[i].getName();
			String ext=name.substring(name.lastIndexOf('.')+1); //Ȯ���ڸ� �߶󳻱�
			if(ext.equals("java"))
			{
				System.out.println(name);
			}
		}
	}

}
