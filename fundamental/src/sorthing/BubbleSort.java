package sorthing;

public class BubbleSort {
	
	
	public static void printArr(int[] arr) {
		int n=arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void BubbleSort(int[] arr) {
		int n=arr.length;
		
		for(int i=0; i<n-1 ;i++)
		{
			
			
			for(int j=0; j<n-1-i; j++)
			{
				//finding minimum element
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
	}
	
	public static void main(String [] args) {
		int [] arr= {1,6,0,3,7,2,5};
		BubbleSort(arr);
		printArr(arr);
	}

}
