package sorthing;

public class SecondLargestElement {
	
	public static int SecondLargestElement(int [] arr) {
		if(arr.length==0) {
			return Integer.MIN_VALUE;
		}
		int largest = arr[0];
		int SecondLargest = Integer.MIN_VALUE;
		for(int i=1; i<arr.length; i++) {
			if(largest<arr[i]) {
				SecondLargest = largest;
				largest = arr[i];
			}
			else if(SecondLargest<arr[i] && arr[i]!=largest) {
				SecondLargest = arr[i];
			}
		}
		return SecondLargest;
	}
	
	public static void printArr( int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		int[] arr = {0,9,8,2,5,6};
		printArr(arr);
		 System.out.println("Second largest element in array is");
		System.out.println(SecondLargestElement(arr));
 	}

}
