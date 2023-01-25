
package collection;

import java.util.LinkedList;

public class Linked_list {
	public static void main(String[] args)
	{
		LinkedList L=new LinkedList();
		L.add("Data");
		L.add(null);
		L.add(200);
		L.add(null);
		L.add(200);
		L.add('b');
		System.out.println(L);
		System.out.println(L.size());
		System.out.println(L.contains(200));
		System.out.println(L.isEmpty());
	}

}
