import javax.swing.JOptionPane;

/*
 * �������(Ŭ���� ����ñ��� ����� ����)
 * 	= static : Ŭ��������(Ŭ�������� ���ؼ� ����� ����)
 * 		=> ���� Ŭ���� ��ü�� �������� ���Ǵ� ����
 * 		=> ���� �ӽ��� Ŭ�����δ��� ���ؼ� �ε�Ǿ��� �� �޸� �Ҵ�
 * 		class A
 * 		{
 * 			static int age;
 * 		}
 * 		A a=new A(); //age
 *		A a1=new A(); //age
 *  = instance : ��ü����(��ü�� �����ϰ� ����� ����)
 */
public class ������� {
	String name="��û��"; //null��
	String tel;
	String addr;
	void setAaa()
	{
		String name="ȫ�浿";
		System.out.println(this.name);//this�� �Ⱦ��� ��������(this���� ȫ�浿, ���� ��û�� ã��)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		������� a=new �������(); // name������ ����Ǵ� ����
		a.name=JOptionPane.showInputDialog("�̸��Է�");
		a.tel=JOptionPane.showInputDialog("��ȭ��ȣ �Է�");
		a.addr=JOptionPane.showInputDialog("�ּ� �Է�");
		String result="�̸�:"+a.name+"\n"
				+"��ȭ:"+a.tel+"\n"
				+"�ּ�:"+a.addr;
		JOptionPane.showMessageDialog(null, result);
		
		
	}

}
