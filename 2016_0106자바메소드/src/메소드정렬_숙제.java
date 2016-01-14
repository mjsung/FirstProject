
public class 메소드정렬_숙제 {
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
		for(int i=0;i<4;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
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
