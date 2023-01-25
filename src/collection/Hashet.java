package collection;

import java.util.HashSet;

public class Hashet {
	public static void main(String[] args) {
		HashSet hs=new HashSet();//objected created
		hs.add("Komal");
		hs.add(500);
		hs.add('K');
		hs.add(null);
		hs.add("Komal");
		hs.add(null);
		hs.add(0);
		System.out.println(hs);//print all
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.contains(800));
		System.out.println(hs.contains(500));
	
		
	}

}
