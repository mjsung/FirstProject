/*
 * 2*1=2	3*1=3	4*1=4
 * 
 * 5*1=5	6*1=6	7*1=7
 * 
 * 8*1=8	9*1=9   =>6�ٷ� �ϼ�
 * 
 */
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=9;i+=3)
		{
			for(int j=1;j<=9;j++)
			{
				for(int k=i;k<i+3&&k!=10;k++)
				{
					System.out.print(k+"*"+j+"="+k*j+"\t");
				}
				System.out.println();
			}
			System.out.println("\n\n");
		}
	}

}
