package collection;

import java.util.LinkedHashSet;

public class Link_Hashset {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Name");
		lhs.add(150);
		lhs.add('N');
		lhs.add(null);
		lhs.add("Name");
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.contains(100));
		System.out.println(lhs.isEmpty());
		
	}
}
