package sorthing;

public class PushZeroAtEnd {

  public static void pushZeroAtEnd(int [] arr) {
	  int nonZero = 0;
	  for(int i=0 ; i<arr.length ; i++) {
		  if(arr[i]!=0) {
			  int temp = arr[i];
			  arr[i] = arr[nonZero];
			  arr[nonZero] = temp;
			  nonZero++;
		  }
	  }
  }
  
  public static void printArr(int[] arr) {
	  for(int i=0;i<arr.length;i++) {
		  System.out.print(arr[i]+" ");
	  }
	  System.out.println();
  }
  
  public static void main(String[] args) {
	  int[] arr = {1,2,0,6,9,0};
	  pushZeroAtEnd(arr);
	  printArr(arr);
  }
}
