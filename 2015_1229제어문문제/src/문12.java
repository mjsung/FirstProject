import java.util.Scanner;
public class ��12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ù��° �л� ���� �Է�:");
		int num1=scan.nextInt();
		System.out.println("�ι�° �л� ���� �Է�:");
		int num2=scan.nextInt();
		System.out.println("����° �л� ���� �Է�:");
		int num3=scan.nextInt();
		System.out.println("�׹�° �л� ���� �Է�:");
		int num4=scan.nextInt();
		System.out.println("�ټ���° �л� ���� �Է�:");
		int num5=scan.nextInt();
		System.out.println("������° �л� ���� �Է�:");
		int num6=scan.nextInt();
		System.out.println("�ϰ���° �л� ���� �Է�:");
		int num7=scan.nextInt();
		System.out.println("������° �л� ���� �Է�:");
		int num8=scan.nextInt();
		System.out.println("��ȩ��° �л� ���� �Է�:");
		int num9=scan.nextInt();
		System.out.println("����° �л� ���� �Է�:");
		int num10=scan.nextInt();
		
		int[] jumsu = {num1,num2,num3,num4,num5,num6,num7,num8,num9,num10};
		 for(int i=0; i<jumsu.length; i++)
		 {
			   System.out.println(jumsu[i]);
			  }
		
		int max=0; 
		int min=100;
		
	/*	 for(int i = 0; i<jumsu.length; i++)
			   if(max < jumsu[i])//jumsu[i]���� max���� ũ��
			   {   
			    max = jumsu[i];   //�� ���� max�� �����Ѵ�.
			   }
		 for(int j = 0; j<jumsu.length; j++)
			   if(min < jumsu[i])//jumsu[i]���� max���� ũ��
			   {   
			    min = jumsu[i];   //�� ���� max�� �����Ѵ�.
			   }
		*/
		
		for(int i=0;i<jumsu.length;i++){
			if(max<jumsu[i])
				max=jumsu[i];
			if(min>jumsu[i])
				min=jumsu[i];}
			
			System.out.println();
			System.out.println("�ִ밪:"+max);
			System.out.println("�ּҰ�:"+min);
			
			
			int sum=0;
			double avg=0;
			
	        for ( int i =0 ; i < jumsu.length ; i++)
	        {
	            sum= sum + jumsu[i];
	        }
	            avg = sum / jumsu.length;
	            System.out.println("����:"+sum);
				System.out.println("���:"+avg); 
	}
	
}
				


