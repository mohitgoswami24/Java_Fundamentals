package fraction;

public class fractionUse {
	public static void main(String [] args) {
		fraction f1 = new fraction(4,6);
		
	
		f1.print();
		
		fraction f2 = new fraction(4,8);
		f2.print();
		
		fraction f3= fraction.add(f1,f2);
		f3.print();
		
		
	}

}
