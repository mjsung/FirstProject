//trim() : 좌우의 공백을 제거
public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id=" ad min ";
		System.out.println("문자길이: "+id.length());
		String res=id.trim();
		System.out.println("문자길이: "+res.length()); //trim은 앞뒤만 제거,중간은 공백 제거 못함
		System.out.println(id); //원본은 훼손되지 않는다
	}

}
