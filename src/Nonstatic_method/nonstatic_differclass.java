package Nonstatic_method;

public class nonstatic_differclass {
	public static void main(String[] args) {//non static method call from differnt class
		//create object
		test1 d=new test1();//d is ref variable and new is keyword
		d.m5();
		d.m6();
		test2 k=new test2();
		k.m3();
		k.m4();
	}

}
