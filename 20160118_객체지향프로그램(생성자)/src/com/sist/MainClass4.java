package com.sist;
/*
 * 	����������
 * 		private, protected, default, public
 * 		    =========================================
 * 			�ڽ��� Ŭ���� | ���� ��Ű��(����)| ��ӹ��� Ŭ����| ��� Ŭ����
 * 		    =========================================
 * private      o		   x		   x		x
 * protected	o		   o		   o		x
 * default		o		   o		   x		x
 * public		o		   o		   o		o
 *
 * 		==> ������� : private(����ȭ)
 * 			����޼ҵ� : public
 * 			===================ĸ��ȭ
 * 		==> ����
 * 			private < default < protected < public
 *
 *		�������
 *		����) 
 *			���������� (�ɼ�) �������� ������
 *				static|final	
 *		�޼ҵ�
 *		����)
 *			���������� (�ɼ�) ������ �޼ҵ��(�Ű�����...)	
 *				static|abstract|final
 *			{
 *			}
 *		Ŭ����
 *		����)
 *			���������� (�ɼ�) class className
 *			{
 *			}
 *		*********�����ڴ� �ݵ�� public�� ����ϴ� ���� ����
 *
 */

//ĸ��ȭ
class Saram
{
	private String name;
	private String jumin;
	private int age;
	double ki;
	protected String tel;
	public String addr;
	
	//source-> getter setter�� name, jumin,age�� ������ -> ������� ������ � Ŭ���������� ������ �� ����
		//�����Ϳ� ���������� ������ ���� ���� �� �޼ҵ带 ���ؼ� ����(ĸ��ȭ)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saram s=new Saram();
		//s.getName();  �޼ҵ带 �̿��ؼ� name�� �ҷ���, ĸ��ȭ
		
	}

}
