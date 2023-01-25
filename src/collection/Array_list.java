package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_list {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();//duplicates are allowed 
		al.add(null);//no. of null values are allowed
		al.add("Komal");//best choice retrival operation
		al.add(100);//data structure resizeble
		al.add('K');//default capacity is 10
		al.add(null);//order of insertion is maintained
		
		System.out.println(al); //prints entire data
		
		System.out.println(al.size());//get size
		
		System.out.println(al.isEmpty());//false //-checks empty or not
		
		System.out.println(al.contains(200));//true //checks containing data or not
		
		System.out.println(al.get(0));//get data from particular index
		
		Iterator itr = al.iterator();//fetch data using iterator(universal cursor)
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	    ListIterator litr=al.listIterator();//fetch the data using list Iterator
	    while(litr.hasNext())
	    {
	    	System.out.println(litr.next());//print data using for each loop
	    	for(Object s : al)
	    	{
	    		System.out.println(s);
	    	}
	    }
	    
		
		
	}

}
