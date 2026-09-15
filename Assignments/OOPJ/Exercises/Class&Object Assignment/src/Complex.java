
class Complex{
	private int realnum1;
	private int imaginarynum1;
	private int realnum2;
	private int imaginarynum2;
	
	Complex(int realnum1,int imaginarynum1,int realnum2,int imaginarynum2){
		this.realnum1 = realnum1;
		this.imaginarynum1 = imaginarynum1;
		this.realnum2 = realnum2;
		this.imaginarynum2 = imaginarynum2;
	}
	
	void sum() {
		System.out.println("Sum of two complex number is :"+(realnum1+realnum2)+"+"+(imaginarynum1+imaginarynum2)+"i");
	}
	
	void product() {
		System.out.println("Product of two complex number is :"+(realnum1*realnum2)+"+"+(imaginarynum1*imaginarynum2)+"i");
	}
	
	void difference() {
		System.out.println("Difference of two complex number is :"+(realnum1-realnum2)+"+"+(imaginarynum1-imaginarynum2)+"i");
	}
	
	
	
	public static void main(String []args) {
	
		ConsoleInput cI = new ConsoleInput();
		System.out.print("Enter Real Number:");
		int realnuminput1 = cI.getInt();
		System.out.print("Enter Imaginary Number:");
		int imaginarynuminput1 = cI.getInt();
		System.out.println("First Complex Number : "+realnuminput1+"+"+imaginarynuminput1+"i");
		
		System.out.print("Enter Real Number:");
		int realnuminput2 = cI.getInt();
		System.out.print("Enter Imaginary Number:");
		int imaginarynuminput2 = cI.getInt();
		System.out.println("Second Complex Number : "+realnuminput2+"+"+imaginarynuminput2+"i");
		
		Complex cm = new Complex(realnuminput1,imaginarynuminput1,realnuminput2,imaginarynuminput2);
		cm.sum();
		cm.product();
		cm.difference();
		
	}
}