/*
 * 관계연산자 => 결과값은 true/false - boolean
 * 		== 같다  (*******) -> =(대입하다)
 * 		!= 같지않다
 * 		<  작다
 * 		>  크다
 * 		<= 작거나 같다
 * 		>= 크거나 같다
 */


public class 관계연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		int b=9;
		boolean result=(a==++b);//10
		System.out.println("b="+b);
		System.out.println("result="+result);
		result=(a==b++); //10
		System.out.println("b="+b);//11
		System.out.println("result="+result);
		result=(a==b); //11
		System.out.println("b="+b);
		System.out.println("result="+result);*/
		
		int a=10;
		int b=9;
		boolean result=(a!=b); //true
		System.out.println("result="+result);
		b++;
		result=(a!=b); //false
		System.out.println("result="+result);
	}

}
