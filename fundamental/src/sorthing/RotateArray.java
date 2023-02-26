package sorthing;

public class RotateArray {
	
	public static void RotateArray(int[] arr, int d) {
		int n=arr.length;
		int [] temp = new int[n];
		int k=0;
		for(int i=d;i<n;i++) {
			temp[k] = arr[i];
			k++;
		}
		for(int i=0;i<d;i++) {
			temp[k] = arr[i];
			k++;
		}
		for(int i=0;i<n;i++) {
			arr[i] = temp[i];
		}
	}
	
	 public static void printArr(int[] arr) {
		  for(int i=0;i<arr.length;i++) {
			  System.out.print(arr[i]+" ");
		  }
		  System.out.println();
	  }
	 
	 public static void main(String[] args) {
		 int [] arr= {1,2,3,4,5,6};
		 RotateArray(arr,3);
		 printArr(arr);
	 }

}
