
public class ComplexNumber {
	private int number1;
	private int number2;
		
	public void setNum(int num1,int num2) {
		number1 = num1;
		number2 = num2;
	}
	
	int getNum() {
		return computeComplexNumber();
	}
	
	int computeComplexNumber() {
		return number1*number2;
	}
	
	public static void main(String []args) {
		ConsoleInput cI = new ConsoleInput();
		int number1;
		int number2;
		
		ComplexNumber[] cn = new ComplexNumber[5];
		for(int i=0;i<=4;i++) {
			cn[i] = new ComplexNumber();
			System.out.print("Enter Number 1 : ");
			number1 = cI.getInt();
			System.out.print("Enter Number 2 : ");
			number2 = cI.getInt();
			cn[i].setNum(number1,number2);
		}
		
		for(int i=0;i<=4;i++) {
			System.out.print(cn[i].getNum()+" ");
		}
		
		
	}
}
