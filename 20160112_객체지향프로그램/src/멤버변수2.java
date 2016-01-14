import javax.swing.JOptionPane;

public class 멤버변수2 {
	static int hakbun;
	static int kor, eng, math;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("국어점수:");
		kor=Integer.parseInt(str); //정수를 문자열로 바꾸고 싶을 때=> valueOf
		str=JOptionPane.showInputDialog("영어점수:");
		eng=Integer.parseInt(str); //정수를 문자열로 바꾸고 싶을 때=> valueOf
		str=JOptionPane.showInputDialog("수학점수:");
		math=Integer.parseInt(str); //정수를 문자열로 바꾸고 싶을 때=> valueOf
		String result="총점:"+(kor+eng+math)+"\n"
				+"평균"+((kor+eng+math)/3);
		JOptionPane.showMessageDialog(null, result);
	}

}
