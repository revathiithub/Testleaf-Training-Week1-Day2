package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] a= {1,9,40,13,25};
		Arrays.sort(a);
		System.out.println("Printing sorted array");
		for (int i : a) {
		System.out.print(i +"\t");	
		
		}
		
		System.out.println(" \nSecond largest element in the array is "+a[a.length-2]);
	}
}
