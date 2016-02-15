package com.sist;
/*
 * Thread : java.lang
 * 
 * 
 */
class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(getName()+":"+i);
				Thread.sleep(100); //1000분의 1초 단위 Blocked
			}
		}catch(Exception ex){}
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1=new MyThread();
		/*m1.setName("홍길동");
		System.out.println(m1.getName());
		m1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(m1.getPriority());*/
		MyThread m2=new MyThread();
		MyThread m3=new MyThread();
		
		m1.setPriority(10);
		m2.setPriority(1);
		m3.setPriority(1);
		m1.start();
		m2.start();
		m3.start();
		
	}

}
