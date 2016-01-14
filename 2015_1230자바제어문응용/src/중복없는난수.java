/*
 * 1~10 난수발생 => 중복이 없는 난수 발생
 * 1) 난수 발생
 * 2) 난수가 중복이 있는지 여부 확인
 * 3) 중복(o) => 난수 발생
 * 	     중복(x) => 저장
 * 
 * 		 => 1) 10개의 변수=> 배열
 * 			2) 난수저장
 * 			3) 중복체크
 * 
 * 			for(int i=0;i<3;i++)
 * 			{
 * 				for(int j=0;j<3;j++)
 * 					{
 * 						if(j==i)
 * 						break;
 * 						System.out.println(i+","+j)
 * 					}
 * 			}
 * 
 * 			i=0 ==> j=0
 * 			i=1 ==> j=0
 * 			i=2 ==> j=0
 */
public class 중복없는난수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중복없는 난수를 저장하는 변수
		int[] arr=new int[10];
		//난수
		int su=0;
		//중복여부를 확인하는 변수
		boolean bDash=false;
		/*
		 *  arr[0]=5;
		 *  arr[1]=4;
		 *  
		 *  su=4
		 */
		for(int i=0;i<10;i++)
		{
			//중복이 없는 난수가 발생할 때 까지 루프(횟수지정 x -> while)
			bDash=true;
			while(bDash)
			{
				//난수 발생
				su=(int)(Math.random()*10)+1;
				//중복 체크
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(arr[j]==su)
					{
						bDash=true;
						break;//while(조건문)으로 감
					}
				}
			}
			arr[i]=su;
		}
		//출력
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
