package Logical_program;

public class Reverse_String {
public static void main(String[] args) {
	String org="DAD";
	String rev="";
	for(int i=org.length()-1;i>=0;i--){
		 rev=rev+org.charAt(i);
	}
	
	System.out.println(rev);
	//check wheather given string is palindrom or not
	if(org.equals(rev)) {
		System.out.println("given string is palindrome");
		
	}
	else {
		System.out.println("given string is not palindrome");
	}
}
}
