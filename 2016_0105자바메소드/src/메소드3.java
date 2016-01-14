/*
 *   �����߻�  ==> 5
 *     int[] getRand(int s)
 *   ���� 
 *     int[] sort(int[])
 */
public class �޼ҵ�3 {
    static int[] getRand(int num)
    {
    	int[] rand=new int[num];
    	for(int i=0;i<num;i++)
    	{
    		rand[i]=(int)(Math.random()*100)+1;
    	}
    	return rand;
    }
    // ����
    /*
     *     10 7 8 11 23
     *     == ==
     *     7  10 8 11 23
     *     ==   ==
     *     7  10 8 11 23
     *     ==     ==
     *     7  10 8 11 23
     *     ==        ==
     *     7  10 8 11 23
     *        ====
     *         8 10
     *        ==   ==
     *         8 10 11 23
     *        ==      ==
     *         8 10 11 23
     *           == ==
     *           ==    ==
     *         8 10 11 23
     *              == ==
     */
    static int[] sort(char order, int[] rand) //char�� �ϳ� �� ���� ��������, ���������� �����Ͽ� ����� �� �ֵ��� ��
    {
    	for(int i=0;i<rand.length-1;i++)
    	{
    		for(int j=i+1;j<rand.length;j++)
    		{
    			if(order=='A') //�������� �������� ����
    			{
    				if(rand[i]>rand[j]) 
    				{
    					int temp=rand[i];
    				/*
    				 *   rand[i]=10
    				 *   rand[j]=5
    				 *   
    				 *   int t=rand[i];
    				 *     10
    				 *   rand[i]=rand[j];
    				 *    5
    				 *   rand[j]=t;
    				 *    10
    				 */
    					rand[i]=rand[j];
    					rand[j]=temp;
    				}
    			}
    				else
    				{
    					if(rand[i]<rand[j]) 
    					{
    						int temp=rand[i];
        				/*
        				 *   rand[i]=10
        				 *   rand[j]=5
        				 *   
        				 *   int t=rand[i];
        				 *     10
        				 *   rand[i]=rand[j];
        				 *    5
        				 *   rand[j]=t;
        				 *    10
        				 */
    						rand[i]=rand[j];
    						rand[j]=temp;
    					}
    				}
    			}
    		}
    	return rand;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] rand=getRand(5);
        
        System.out.println("������:");
        for(int i=0;i<rand.length;i++)
        {
        	System.out.print(rand[i]+" ");
        }
        int[] rand2=sort('D',rand); //A�� D�� ��������, �������� 
        System.out.println();
        System.out.println("������:");
        for(int i=0;i<rand2.length;i++)
        {
        	System.out.print(rand2[i]+" ");
        }
	}

}
