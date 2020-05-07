package week1.day2;

import java.util.Arrays;

public class ReverseEvenWords {
public static void main(String[] args) {
	
	String s="I am a software tester ok";
	String[] words=s.split(" ");
	
for(int i=0;i<words.length;i++)
{
	if(i%2!=0)
	{
//System.out.println(words[i]);
		char[] temp=words[i].toCharArray();
		String rev="";
		for(int j=temp.length-1;j>=0;j--)
		rev=rev+temp[j];
		//System.out.println(rev);
				words[i]=rev;
						
	}
	System.out.print(words[i]+" ");
	
}
/*for(int i=0;i<words.length;i++)
	System.out.print(words[i]+" ");*/
//s=words.toString();
//System.out.println(Arrays.toString(words));;

}
}
