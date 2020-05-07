package week1.day2;

import java.util.Arrays;

public class ChangeOddIndextoUpperCase {
	
	public static void main(String[] args) {
		
		String test = "changeme";
		char[] c=test.toCharArray();
	
		
		for(int i=0;i<test.length();i++)
		{
			if(i%2!=0)
			{
				
				c[i]=Character.toUpperCase(c[i]);
			}
		}
		
	System.out.println("String after conversion "+c); 
	
		System.out.println(c);
	}

}
