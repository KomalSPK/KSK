package Method_overload_override;

public class Overloading {
	public static void m1(int a,int b)
	{
		System.out.println(a+b);
		
	}
	public static void m1(int a,int b,int c)
	{
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args)
	{
		m1(20,30);
		m1(20,30,40);
	}
	}

