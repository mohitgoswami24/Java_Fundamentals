package recursion;

public class SumOfNaturalNo {

	public static int  sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+sum(n-1);
	}
	public static void main(String [] args) {
		System.out.print(sum(5));
	}
}
