package Logical_program;

import java.util.Arrays;

public class Compare_arrays {
	public static void main(String[] args) {
		int ar1[]= {10,20,30,40};
		int ar2[]= {20,50,70,90};
		int ar3[]= {20,50,70,90};
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(Arrays.equals(ar1, ar3));
		System.out.println(Arrays.equals(ar2, ar3));
	}

}
