/*
 * 문자열 ==> 문자 여러개 묶어서 사용
 * 		  ===============
 * 			char[] ==> 조작해서 만든 클래스 : String
 * 1) 사용 형식
 * 		String 변수명 = "값";
 * 		====== ====
 * 		클래스         객체	 객체변수값 => 객체 : 사용자 정의 데이터형에 대한 변수명
 * 		String 변수명 = new String("값");
 * 					=====
 * 					새로운 메모리를 생성 => 저장
 * 					malloc() => free() 저장과 해제
 * 					new => System.gc() 우리는 저장과 해체를 이렇게!
 * 		String str=new String("java");
 * 		자바 메모리
 * 		=====================================
 * 			method 영역
 * 		=====================================
 * 			stack => 메모리에 의해 저장(지역변수, 매개변수)
 * 		=====================================
 * 			head => 개발자가 저장(new를 이용해서 할당)
 * 		=====================================
 * 		{
 * 		String str=new String("java");
 * 		}
 * 		참조변수 : 배열, String (주소를 참조해서 가져오는!)
 * 			stack		heap(실제 저장)
 * 		========== ==============
 * 			str		   (java)
 * 			100			100
 * 		========== ==============
 * 
 * 		String : 데이터형, 기능
 * 		1) equals : 문자열 비교
 * 		2) length : 문자의 갯수
 * 		3) substring : 문자를 분해할 때
 * 		4) split : 문자 분해
 * 		5) startWith, endWith : 자동 완성기(앞에서부터 같은 , 뒤에서부터 같은)
 * 		6) trim : 좌우의 공백을 제거
 * 		7) indexOf, lastIndexOf : 원하는 위치의 문자 위치
 * 		8) replace : 다른 값으로 변경
 * 		9) valueOf : 모든 데이터형을 문자열로 변경
 * 		10) charAt(0) : 해당 문자열에서 문자 한 개를 가지고 올 때
 */
public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		String str2=new String("Hello");
		if(str==str1)
		{
			System.out.println("str과 str1은 같다(주소가)");
		}
		if(str==str2)
		{
			System.out.println("str과 str2은 같다(주소가)");
		}
		else
		{			
				System.out.println("str과 str2는 다르다(주소가)");
		}
		if(str.equalsIgnoreCase(str2)) //equals 는 문자열 비교, equalsIgnoreCase는 대소문자 무시하고 비교
		{
			System.out.println("str과 str2는 문자열이 같다");
		}
		else
		{			
				System.out.println("str과 str2는 문자열이 다르다");
		}
	}

}

















