package week1.day2;

public class SumOfDigitsFromString {
	public static void main(String[] args) {
		String text = "Tes12Le79af651";
		char[] c=text.toCharArray();
		int sum=0;
		
		for (char d : c) {
			
			if(Character.isDigit(d))
			{
				sum=sum+Character.getNumericValue(d);
			}
			
		}
		System.out.println("Sum of digits in the String is "+sum);
	}

}
