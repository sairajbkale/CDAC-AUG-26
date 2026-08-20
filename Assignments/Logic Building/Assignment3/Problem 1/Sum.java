import java.util.*;
class Sum{
		public static void main(String []args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number");
			int num2 = sc.nextInt();
			Sum s = new Sum();
			System.out.println("The Sum is "+s.sumOfTwoNumbers(num1,num2));
		}

int sumOfTwoNumbers(int num1,int num2){
	return num1 + num2;
}
}