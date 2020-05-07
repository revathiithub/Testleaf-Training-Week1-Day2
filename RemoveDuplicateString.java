package week1.day2;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words=text.split(" ");
		int l=words.length;
		//System.out.println(l);
		int count;
		
		for(int i=0;i<l;i++)
		{
			count=1;
			for(int j=i+1;j<l;j++)
			{
				
				if(words[i].equalsIgnoreCase(words[j]))
				{
					
				words[j]="";
					count++;
				
				}
	
					}
					
			if(words[i]!="" && count==1)
			System.out.print(words[i]+" ");
		}
		/*for (String string : words) {
		 * if(words[i]!=""
			System.out.print(string);
		System.out.print(" ");
		}
	*/
		
		
	}
}
