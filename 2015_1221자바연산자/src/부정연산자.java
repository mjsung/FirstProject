/*
 ! true =? false
   false=> true ==> boolean
 */
public class 부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=false;
		bCheck=!bCheck;
		System.out.println("bCheck="+bCheck);
		
		int a=10;
		int b=~a; //~ 표시는 음수표현이다
		System.out.println("b="+b);
	}

}
