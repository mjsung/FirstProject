package com.sist;
//Object : finalize() : ��ü�޸� ȸ���ÿ� ȣ��Ǵ� �޼ҵ�
//===> null => GC���(finalize())
class Member
{
	public Member()
	{
		System.out.println("(������ ȣ�� : �޸� �ʱ�ȭ) Member() Call..");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("��ü �Ҹ� : finalize() Call...");
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m=new Member();	
		m=null;
		System.gc();
	}

}
