package Logical_program;

public class Remove_splsymbol_string {//replace all method is used to remove spl symobl fro string
	public static void main(String[] args) {
		String s="KOM&A%L";
		String CN=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(CN);
		
	}

}
