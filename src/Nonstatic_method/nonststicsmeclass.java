package Nonstatic_method;

public class nonststicsmeclass {
	public static void main(String[] args) 
	{
		t1();
		nonststicsmeclass d=new nonststicsmeclass();
		d.t2();
	}
public static void t1()
{
	System.out.println("i m from static t1");
	
}
public static void t2()
{
	System.out.println("i m from static t2");
}
}
