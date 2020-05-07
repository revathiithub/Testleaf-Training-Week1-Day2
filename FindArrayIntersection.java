package week1.day2;

public class FindArrayIntersection {
	public static void main(String[] args) {
		
		int arr1[]= {3,2,11,4,7,6};
		int arr2[]= {1,8,2,9,4,7};
		/*int arr1[]= {1,2,3,4,5};
		int arr2[]= {9,10,11,10,12,15};*/
	System.out.print("Array1 : ");
	for (int i : arr1) {
		System.out.print(i+"\t");
		
	}
	System.out.println();
	System.out.print("Array2 : ");
	for (int i : arr2) {
		System.out.print(i+"\t");
		
	}
	System.out.println("\n"+"Intersection in Array :");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+"\t");
					break;
				}
			}
		}
	}

}
