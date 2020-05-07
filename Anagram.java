package week1.day2;

import java.util.Arrays;

public class Anagram {
	// 2 strings are called anagram if it contains same sets of characters but in different order 
	//eg.( "Keep", "Peek");("Mother In Law", "Hitler Woman");  
	
	public static void main(String[] args) {
		
		String s1="Keep";
		String s2="Peek";
		
		// need to validate length equal and convert both to lower case and then sort and  if its equal
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
	if(Arrays.equals(c1,c2))
		System.out.println("Strings are Anagram");
	else
		System.out.println("Strings not Anagram");
	}

}
