import javax.swing.JOptionPane;

/*
 * 멤버변수(클래스 종료시까지 사용이 가능)
 * 	= static : 클래스변수(클래스명을 통해서 사용이 가능)
 * 		=> 같은 클래스 객체는 공통으로 사용되는 변수
 * 		=> 가상 머신이 클래스로더를 통해서 로드되었을 때 메모리 할당
 * 		class A
 * 		{
 * 			static int age;
 * 		}
 * 		A a=new A(); //age
 *		A a1=new A(); //age
 *  = instance : 객체변수(객체를 생성하고 사용이 가능)
 */
public class 멤버변수 {
	String name="심청이"; //null값
	String tel;
	String addr;
	void setAaa()
	{
		String name="홍길동";
		System.out.println(this.name);//this를 안쓰면 지역변수(this빼면 홍길동, 쓰면 심청이 찾음)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		멤버변수 a=new 멤버변수(); // name변수가 저장되는 시점
		a.name=JOptionPane.showInputDialog("이름입력");
		a.tel=JOptionPane.showInputDialog("전화번호 입력");
		a.addr=JOptionPane.showInputDialog("주소 입력");
		String result="이름:"+a.name+"\n"
				+"전화:"+a.tel+"\n"
				+"주소:"+a.addr;
		JOptionPane.showMessageDialog(null, result);
		
		
	}

}
