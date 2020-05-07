package week1.day2;

public class PallindromeString {
	public static void main(String[] args) {
		String s="Madam";
		System.out.print(s);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
						rev=rev+s.charAt(i);
		
		}
		
		if(s.equalsIgnoreCase(rev))
			System.out.print(" is a pallindorme string");
		else
			System.out.print(" is not a pallindrome string");
	}
}

/*	// to compare strings in either uppercase/lowercase
	public static void main(String[] args) {
		String s="ardra";
		System.out.println(s);
		String rev="";
		int i=0;
		int l=s.length();
		int j=l-1;
		int count=0;
		
while(i<l/2)
		{
	if (s.charAt(i)!=s.charAt(j))
	{
		System.out.println(s.charAt(i));
		System.out.println(s.charAt(j));
		System.out.println("not a pallindrome string");
		count++;
		break;
	}
	i++;
	j--;
	
		}
if(count==0)
	System.out.println("a palindrome string");
	}
}*/
