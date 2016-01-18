package com.sist.swap;

public class MainClass {
    void swap(int a,int b)
    {
    	System.out.println("변경전:a="+a+",b="+b);
    	int temp=a;
    	a=b;
    	b=temp;
    	System.out.println("변경후:a="+a+",b="+b);
    }
    void swap2(int[] arr)
    {
    	System.out.println("ARR="+arr);
    	System.out.println("변경전:arr[0]="+arr[0]+",arr[1]="+arr[1]);
    	int temp=arr[0];
    	arr[0]=arr[1];
    	arr[1]=temp;
    	System.out.println("변경후:arr[0]="+arr[0]+",arr[1]="+arr[1]);
    }
    void process()
    {
    	int a=10; // void swap(int *p1,int *p2)
    	int b=20; // &a  swap(&a,&b)
    	swap(a,b);
    	System.out.println("원래 변수값:a="+a+",b="+b);
    	// call by value
    	int[] arr={10,20};
    	System.out.println("arr="+arr);
    	swap2(arr);
    	System.out.println("swap후:arr[0]="+arr[0]+",arr[1]="+arr[1]);
        // 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MainClass m=new MainClass();
        m.process();
	}

}
