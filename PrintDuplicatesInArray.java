package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int l= arr.length;
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if (arr[j]==arr[i]) {
					System.out.println(arr[i]+" is duplicate in the array");
					break;
				}
			}
		}
		
		
	}
}
