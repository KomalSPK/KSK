package Exceptions;

public class Arithmatic_exception {
	public static void main(String[] args)
	{
		int a=1;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
			
		}
		catch(Throwable monkey) {
			System.out.println("Exception is handled");
			
		}
		System.out.println("Komal");
	}

}
