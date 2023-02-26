package String;


public class reverseString {

	public static String revString(String str) {
		String revStr = "";
//		for(int i=0;i<str.length();i++) {
//			revStr = str.charAt(i)+ revStr;
//		}
//	
		for(int i=str.length()-1;i>=0;i--) {
			revStr += str.charAt(i);
		}
		
		
		return revStr;
	}
	
	
	public static void main(String [] args) {
		
		String str="abcd";
		String revStr = revString(str);
		System.out.println(revStr);
	}
	
}
