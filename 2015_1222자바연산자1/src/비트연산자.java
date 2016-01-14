/*
 * 10 & 5
 *  1010
 *  0101
 *  ----&
 *  0000    => 0
 *  
 *  12 & 8
 *  1100
 *  1000
 *  ----&
 *  1000 => 8
 *  
 *  10 | 5
 *  1010
 *  0101
 *  -----|
 *  1111 => 15
 *  
 *  12 | 8
 *  1100
 *  1000
 *  -----|
 *  1100 => 12
 *  
 *  10 ^ 5
 *  1010
 *  0101
 *  -----^
 *  1111 => 15
 *  
 *  12 ^ 8
 *  1100
 *  1000
 *  -----^
 *  0100 => 4
 */
public class 비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10&5="+(10&5));
		System.out.println("17&10="+(17&10));
		System.out.println("12&8="+(12&8));
		
		System.out.println("10|5="+(10|5));
		System.out.println("17|10="+(17|10));
		System.out.println("12|8="+(12|8));
		
		System.out.println("10^5="+(10^5));
		System.out.println("17^10="+(17^10));
		System.out.println("12^8="+(12^8));
	}

}
