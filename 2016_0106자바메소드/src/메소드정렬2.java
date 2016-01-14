
public class 메소드정렬2 {
    static int[] getData()
    {
    	int[] data=new int[5];
    	for(int i=0;i<data.length;i++)
    	{
    		data[i]=(int)(Math.random()*100)+1;
    	}
    	return data;
    }
    static int[] sort(int[] arr)
    {
    	for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=0;j<arr.length-1-i;j++)
    		{
    			if(arr[j]>arr[j+1])
    			{
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    		}
    	}
    	return arr;
    }
    static void process()
    {
    	int[] arr=getData();
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    	int[] data=sort(arr);
    	for(int i=0;i<data.length;i++)
    	{
    		System.out.print(data[i]+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
