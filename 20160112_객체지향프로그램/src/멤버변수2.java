import javax.swing.JOptionPane;

public class �������2 {
	static int hakbun;
	static int kor, eng, math;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("��������:");
		kor=Integer.parseInt(str); //������ ���ڿ��� �ٲٰ� ���� ��=> valueOf
		str=JOptionPane.showInputDialog("��������:");
		eng=Integer.parseInt(str); //������ ���ڿ��� �ٲٰ� ���� ��=> valueOf
		str=JOptionPane.showInputDialog("��������:");
		math=Integer.parseInt(str); //������ ���ڿ��� �ٲٰ� ���� ��=> valueOf
		String result="����:"+(kor+eng+math)+"\n"
				+"���"+((kor+eng+math)/3);
		JOptionPane.showMessageDialog(null, result);
	}

}
