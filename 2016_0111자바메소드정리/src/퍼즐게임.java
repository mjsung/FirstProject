/*
 *    ��� 
 *    1) ����  ==> �迭 ���� 
 *    2) ���  ==> ��� (�迭)
 *    3) �Է�  ==> ����
 *    4) ����  ==> �迭�� ����  
 *    5) ���� 
 *    
 *    ����
 *     1) ������ ���� 
 *                   �޸���ġ   �޸� ���� ����
 *        ==============================
 *          static     method �����Ͻÿ� �ڵ� (Ŭ���� ��ü)
 *             ==> ���뺯�� , Ŭ���� ���� 
 *                 Ŭ�����̸�.������
 *                 ==> �޸� ���� 1�� 
 *        ==============================
 *          instance    heap  new������ ���ÿ� 
 *                             (Ŭ���� ��ü)
 *             ==> ��ü ���� 
 *                 ��ü�̸�.������ 
 *                 ==> new��� ������ŭ ���� 
 *        ==============================
 *          local       stack  �޼ҵ�ȣ��� 
 *                             (�޼ҵ� ����������)
 *            ==> �������� 
 *        ==============================
 */
import java.util.Scanner;
public class ������� {
    static int[][] panCount=new int[3][3];
    static int brow,bcol;
    // ������� => �ڵ����� �ʱ�ȭ (int=0,String=null..)
    // ���� �߻� 
    static void getRand()
    {
    	int[] temp=new int[9];
    	int su=0;
    	boolean bDash=false;
    	for(int i=0;i<9;i++)
    	{
    		bDash=true;
    		while(bDash)
    		{
    			// ���� �߻� 
    			su=(int)(Math.random()*9);
    			bDash=false;
    			for(int j=0;j<i;j++)
    			{
    				if(temp[j]==su)
    				{
    					bDash=true;//while�̵�
    					break;
    				}
    			}
    		}
    		temp[i]=su;
    		panCount[i/3][i%3]=temp[i];
    		if(su==8)
    		{
    			brow=i/3;
    			bcol=i%3;
    		}
    		/*
    		 *    =======================
    		 *      0        1     2
    		 *    0/3,0%3  1/3 1%3 2/3 2%3
    		 *      00      01      02
    		 *    =======================
    		 *      3        4      5
    		 *    3/3 3%3  4/3 4%3 5/3 5%3
    		 *      10      11      12
    		 *    =======================
    		 *      6
    		 *    6/3 6%3  7/3 7%3  8/3 8%3
    		 *      20      21       22
    		 *      
    		 *      2*3+0  2*3+1     2*3+2
    		 *    =======================
    		 * 
    		 */
    		
    	}
    }
    static void display()
    {
    	for(int i=0;i<3;i++)
    	{
    		for(int j=0;j<3;j++)
    		{
    			if(i==brow && j==bcol)
    				System.out.print("  ");
    			else
    				System.out.print((panCount[i][j]+1)+" ");
    		}
    		System.out.println();
    	}
    }
    static void process()
    {
    	getRand();
    	display();
    	Scanner scan=new Scanner(System.in);
    	while(true)
    	{
    		System.out.print("1~8���� �����Է�:");
    		int input=scan.nextInt();
    		int a=0;
    		int b=0;
    		for(int i=0;i<3;i++)
    		{
    			for(int j=0;j<3;j++)
    			{
    				if((panCount[i][j]+1)==input)
    				{
    					
    					a=i;
    					b=j;
    					break;
    				}
    			}
    		}
    		panCount[brow][bcol]=
					panCount[a][b];
			panCount[a][b]=8;
			brow=a;
			bcol=b;
			display();
			if(isEnd())
			{
				System.out.println("Game over!!");
				break;
			}
    	}
    }
    static boolean isEnd()
    {
    	int k=0;
    	for(int i=0;i<3;i++)
    	{
    		for(int j=0;j<3;j++)
    		{
    			if(panCount[i][j]!=k)
    				return false;
    			k++;
    		}
    	}
    	return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}




