package collection;

import java.util.Vector;

public class Vector_class {
public static void main(String[] args) {
	Vector vr=new Vector();//object created
	vr.add("komal");//duplication allowed
	vr.add('K');//no. of null values allowed
	vr.add(null);//order of insertion maintained
	vr.add(100);//default capacity 10
	vr.add('K');
	vr.add(null);
	System.out.println(vr);//to print all data
	System.out.println(vr.size());//to check size
	System.out.println(vr.isEmpty());//to check its epty or not
	System.out.println(vr.contains('K'));//to check particular object
	vr.add(1,'V');//insertion (to shift right)
	System.out.println(vr);
	vr.remove(1);//remove(to shift left)
	System.out.println(vr);
}
}
