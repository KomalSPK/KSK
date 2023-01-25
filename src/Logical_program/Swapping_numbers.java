package Logical_program;

public class Swapping_numbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
	/*	//using 3rd variable
		int c=a;//c=10
		a=b;//a=20
		b=c;//b=10
		System.out.println(a);
		System.out.println(b);  */
		
		//without usimg 3rd variablee
		a=a+b;//30
		b=a-b;//10
		a=a-b;//30-10=20
		System.out.println(a);
		System.out.println(b);
		
	}

}
