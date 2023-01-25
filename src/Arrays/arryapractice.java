package Arrays;

import java.util.ArrayList;

public class arryapractice {
		public static void main(String[] args)
		{
		ArrayList al=new ArrayList();
		al.add("Komal");
		al.add(100);
		al.add("k");
		al.add(null);
		al.add(null);

		System.out.println(al);//print all data 
		System.out.println(al.size());//checks size
		System.out.println(al.isEmpty());//fasle
		System.out.println(al.contains(100));//true

		}
		

}
