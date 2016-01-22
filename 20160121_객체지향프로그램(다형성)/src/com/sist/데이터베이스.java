package com.sist;
//interface�� �ַ� �ϴ� ���� : ���� �ٸ� Ŭ������ �����ؼ� ����� �� �ִ� 
/*
 * 	interface A
 * 	{
 * 		int a=10;	//public static final
 * 		void disp(); // public abstract
 * 	}
 */
interface Connection
{
	public void getConnection();
	//1.8�������� ��밡����!!!
	static void disConnection() //static�̶� �������� ��� ����, public ����
	{
		System.out.println("������ ���̽� ����");
	}
	default public void increment()  //�Ϲݸ޼ҵ�. ������ �޼ҵ�, public ����
	{
		System.out.println("auto increment");
	}
}
class Oracle implements Connection
{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("����Ŭ ����...");
	}

	@Override
	public void increment() {
		System.out.println("create sequence..");
	}
	
}
class MSSQL implements Connection
{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("MSSQL ����...");
	}
	
}
class MySQL implements Connection
{

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		System.out.println("MySQL ����...");
	}
	
}
class Container
{
	public Connection getDeataBase(String type)
	{
		Connection conn=null;
		if(type.equals("oracle"))
			conn=new Oracle();
		else if(type.equals("mysql"))
			conn=new MySQL();
		else if(type.equals("mssql"))
			conn=new MSSQL();
		return conn;
	}
}
public class �����ͺ��̽� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Container c=new Container();
			Connection conn=c.getDeataBase("oracle");
			conn.getConnection();
			conn.increment();
			Connection.disConnection();
			
			
			conn=c.getDeataBase("mysql");
			conn.getConnection();
			conn.increment();
			Connection.disConnection();
			
			conn=c.getDeataBase("mssql");
			conn.getConnection();
			conn.increment();
			Connection.disConnection();
	}

}
