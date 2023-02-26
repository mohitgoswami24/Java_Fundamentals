package String;

public class StringComparision {
	

	public static void main(String[] args) {
		
		String str1= "abc";
		String str2= "abc";
		String str3=new String("abc");
		
		
		if(str1 == str3) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
		System.out.println(str1+" "+str2);
		
//		int arr1[]= {1,2};
//		int arr2[]= {1,2};
//		
//		
//		if(arr1 == arr2) {
//			System.out.println("Both are equal");
//		}
//		else {
//			System.out.println("Both are not equal");
//		}
//		
//		System.out.println(arr1+" "+arr2);
	}
}
