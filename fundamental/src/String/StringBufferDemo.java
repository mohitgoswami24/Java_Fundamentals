package String;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("abc");
		str.setCharAt(0, 'd');
		str.append("  xyz");
		str.insert(3,"rt");
		System.out.print(str);
	}

}
