package Logical_program;

import java.util.Arrays;

public class Array_ascending {
public static void main(String[] args) {
	int ar[]= {58,25,11,15,63};
	//for printing original array we need to print original array
	Arrays.sort(ar);//to print ascending order
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	//for printing descending order
	for(int i=ar.length-1;i>=0;i--) {
		System.out.println(ar[i]);
	}
}
}
