package collection;

import java.util.TreeSet;

public class Treeset_class {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(100);
	    ts.add(50);
	    ts.add(1);
	    
	    System.out.println(ts);
	    System.out.println(ts.size());
	    System.out.println(ts.isEmpty());
	    System.out.println(ts.contains(100));
	
	}

}
