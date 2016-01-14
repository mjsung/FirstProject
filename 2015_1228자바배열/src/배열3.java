//난수를 발생 5 => 최대값, 최소값
public class 배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int[5];
		for(int i=0;i<score.length;i++)
		{
			score[i]=(int)(Math.random()*100)+1;
			
		}
		int max=0; // 최대값을 구해야하니까 제일 작은값으로 둔다큰 값과 비교해서 바꿔야 하므로!
		int min=100;// 최소값을 구해야하니까 제일 큰값을 둔다. 작은값과 비교해서 바꿔나가야 함.
		for(int i=0;i<score.length;i++){
			if(max<score[i])
				max=score[i];
			if(min>score[i])
				min=score[i];
		}
		System.out.println("실제난수값");
		for(int i=0;i<score.length;i++)
		{
			System.out.print(score[i]+" ");
		}
		System.out.println();
			System.out.println("최대값:"+max);
			System.out.println("최소값:"+min);
	}

}
