package week1.day2;

public class CharOccurence {

	public static void main(String[] args) {
		
		String s="welcome to chennai";
		char charToCheck='n';
		int count=0;
		
		char[] charArray=s.toCharArray();
		for (char c1 : charArray) {
			
			if (c1==charToCheck)
			count++;
			
		}
		
		System.out.println("No of Ocurenes of "+charToCheck+" in "+s+" is "+count);
	}
}
