package ObjectAndClasses;

public class DynamicArrayUse {
   public static void main(String [] args) {
	   dynamicArray d = new dynamicArray();
	   for(int i=0;i<100;i++) {
		   d.add(100+i);
	   }
	   System.out.println(d.get(99));
   }
}
