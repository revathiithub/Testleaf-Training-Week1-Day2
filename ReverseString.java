package week1.day2;

public class ReverseString {
	public static void main(String[] args) {
		
		String test = "feeling good";
		//System.out.println(test.length());
		
	/*for(int i=(test.length()-1);i>=0;i--)
	{
		System.out.print(test.charAt(i));
	}
	}*/

	char[] c=test.toCharArray();
	for(int i=c.length-1;i>=0;i--)
	{
		System.out.print(c[i]);
	}
}
}