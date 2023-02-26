package recursion;

public class Recursion2 {
	
	//replace char=a with char=b
	public static String replaceChar(String s, char a, char b) {
		if(s.length()==0) {
			return s;
		}
		String smallOutput = replaceChar(s.substring(1),a,b);
		if(s.charAt(0)==a) {
			return b + smallOutput;
		}
		else {
			return s.charAt(0) + smallOutput;
		}
	}
	
	//remove x from string
	public static String replaceX(String s) {
		
		if(s.length()==0) {
			return s;
		}
		String smallOutput = replaceX(s.substring(1));
		if(s.charAt(0) == 'x') {
			return smallOutput;
		}
		else {
			return s.charAt(0)+smallOutput;
		}
	}
	
	//replace pi with 3.14
	public static String replacepi(String s) {
		String c = "pi";
		if(s.length() <= 1) {
			return s;
		}
		
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			String smallOutput = replacepi(s.substring(2));
			return "3.14"+smallOutput;
		}
		else {
			String smallOutput = replacepi(s.substring(1));
			return s.charAt(0)+smallOutput;
		}
	}
	
	//binary Search using recursion.
	public static int binarySearch(int a[], int si, int ei, int x) {
		if(si > ei ) {
			return -1;
		}
		int midIndex = (si + ei)/2;
		if( midIndex == x ) {
			return midIndex;
		}
		else if ( midIndex > x ) {
			return binarySearch(a, midIndex+1, ei, x);
		}
		else {
			return binarySearch(a, si, midIndex-1, x);
		}
	}
	
	//mergesort
	public static void mergeSort(int a[]) {
		if(a.length<=1) {
			return;
		}
		int b[] = new int [a.length/2];
		int c[] = new int [a.length-b.length];
		
		for(int i=0; i<a.length/2; i++) {
			b[i] = a[i];
		}
		
		for(int i=a.length/2; i<a.length; i++) {
			c[i-a.length/2] = a[i];
		}
		
		mergeSort(b);
		mergeSort(c);
		merge(b,c,a);
	}
	//merge
	public static void merge(int s1[], int s2[], int d[]) {
		int i=0;
		int j=0;
		int k=0;
		while(i<s1.length && j<s2.length) {
			if(s1[i] <= s2[j]) {
				d[k] = s1[i];
				i++;
				k++;
			}
			else {
				d[k] = s2[j];
				k++;
				j++;
			}
		}
		if(i<s1.length) {
			while(i<s1.length) {
				d[k] = s1[i];
				i++;
				k++;
			}
		}
		if(j<s2.length) {
			while(j<s2.length) {
				d[k] = s2[j];
				k++;
				j++;
			}
		}
	}
	
	
	//Quick Sort partition function
	public static int partition(int a[], int si, int ei) {
		int pivotElement = a[si];
		int smallNumberCount = 0;
		for(int i=si+1; i<a.length; i++) {
			if(a[i]<pivotElement) {
				smallNumberCount++;
			}
		}
		int temp = a[si + smallNumberCount];
		a[si + smallNumberCount] = pivotElement;
		a[si] = temp;
		
		int i=si;
		int j=ei;
		while( i<j ) {
			if( i < pivotElement) {
				i++;
			}
			else if( j >= pivotElement) {
				j--;
			}
			else {
				int tem = a[i];
				a[i] = a[j];
				a[j] = tem;
				i++;
				j--;
			}
		}
		return si+smallNumberCount;
	}
	//Quick sort using starting index and ending index
	public static void quickSort(int[] a,int si, int ei) {
		if(si >= ei) 
			return;
		int pivotIndex = partition(a,si,ei);
		quickSort(a,si,pivotIndex-1);
		quickSort(a,pivotIndex+1,ei);
	}
	//quickSort
	public static void quickSort(int a[]) {
		quickSort(a,0,a.length-1);
	}
	//print array
	public static void printArr(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+"");
		}
	}
	
	
	
	
	//main class
	public static void main(String [] args) {
		
		
		System.out.println(replaceChar("abcda",'a','b'));
	
		System.out.println(replacepi("apiapiapiapi"));
		
		int[] arr = new int[] {5,3,6,1,0,9,2};
		mergeSort(arr);
		printArr(arr);
		
		System.out.println("");
		
		int[] arr1 = new int[] {7,4,1,5,9};
		quickSort(arr1);
		printArr(arr1);
		
		
	}

}
