package fraction;

public class fraction {
     private int numerator;
     private int denominator;
     
     
     public fraction(int numerator, int denominator) {
    	 if(denominator == 0) {
    		 denominator = 1;
    	 }
    	 this.numerator = numerator;
    	 this.denominator = denominator;
    	 simplify();
    	 
     }


	private void simplify() {
		// TODO Auto-generated method stub
		int gcd = 1;
		int smaller = Math.min(numerator,denominator);
		for(int i=2;i<=smaller;i++) {
			if(numerator%i==0 && denominator%i==0) {
				gcd=i;
			}
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
		
	}


	public void print() {
		System.out.println(numerator+"/"+denominator);
		
	}


	public void increment() {
		// TODO Auto-generated method stub
		numerator=numerator+denominator;
		simplify();
		print();
		
		
	}


	public void setNumerator(int i) {
		// TODO Auto-generated method stub
		this.numerator=i;
		
	}


	public int  getNumerator() {
		// TODO Auto-generated method stub
		return numerator;
		
	}


	public void setDenominator(int i) {
		// TODO Auto-generated method stub
		if(i<=0) {
			return;
		}
		this.denominator=i;	
	}


	public int getDenominator() {
		// TODO Auto-generated method stub
		return denominator;
		
	}


	public void add(fraction f2) {
		// TODO Auto-generated method stub
		this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator ;
		this.denominator = this.denominator*f2.denominator;
		simplify();
		
		
	}
	
	public static fraction add(fraction f1,fraction f2) {
		int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator ;
		int newDen = f1.denominator*f2.denominator;
		fraction f3 = new fraction(newNum,newDen);
		return f3;
	
	}
	
	
	
}
