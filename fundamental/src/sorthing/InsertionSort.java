package sorthing;

public class InsertionSort {
	public static void printArr(int[] arr) {
		int n=arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String [] args) {
		int [] arr = {7,8,3,1,2};
        for(int i=1; i<arr.length; i++) {
        	int current = arr[i];
        	int j = i-1;
        	while(j>=0 && current<arr[j]) {
        		arr[j+1] = arr[j];
        		j--;
        	}
        	arr[j+1] = current;
        }
        printArr(arr);
	}

}
