package week1.day2;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,9};
			
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]!=i+1) {
				
				System.out.println("Missing Element in the array is "+(i+1));
			break;
			}
		}
	}
}
