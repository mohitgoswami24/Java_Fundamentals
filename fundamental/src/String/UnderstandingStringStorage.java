package String;

public class UnderstandingStringStorage {
public static void main(String [] args) {
		
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";//string pool
	    System.out.println(System.identityHashCode(s1));
	    System.out.println(System.identityHashCode(s2));
	    System.out.println(System.identityHashCode(s3));
	}
}
