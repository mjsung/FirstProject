
public class �޼ҵ�6 {
	static void a()
	{
		System.out.println("a() start...");
		b();
		System.out.println("a() end...");
	}
	static void b()
	{
		System.out.println("b() start...");
		c();
		System.out.println("b() end...");
		
	}
	static void c()
	{
		System.out.println("c() start...");
		d();
		System.out.println("c() end...");
	}
	static void d()
	{
		System.out.println("d() start...");
		System.out.println("d() end...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() start...");
		a();
		System.out.println("main() end...");
	}

}
