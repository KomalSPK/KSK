package variable;

public class nonstatic {//class body open
	 int i =20;
	public static void main(String[] args) {//main method body open
		//create object
		nonstatic n = new nonstatic();
		
		System.out.println(n.i);
	}//main body close

}//class body close
