import java.util.*;
class PositiveNo{
	public static void main(String []args){
			
			PositiveNo pn = new PositiveNo();
			pn.askForPositiveNumber();
	}
	void askForPositiveNumber(){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do{
			System.out.println("Enter the number: ");
			i = sc.nextInt();
		}while(i<=0);
		System.out.println("The positive number is "+i);
}
}