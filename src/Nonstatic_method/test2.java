package Nonstatic_method;

public class test2 {
	public static void main(String[] args)
	{
		test2 d=new test2();//object created n d is ref variable
		//we need to call using ref variable
		d.m3();
		d.m4();
		
	}
	public void m3() {//it is non static is not coming here
System.out.println("i m from non static m3()");
System.out.println("good");
	}
	public void m4() {
		System.out.println("i m from non static m4()");
		System.out.println("very good");
		}
	}
