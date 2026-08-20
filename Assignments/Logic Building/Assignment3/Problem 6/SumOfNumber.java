import java.util.*;
class SumOfNumber{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int num = sc.nextInt();
		SumOfNumber sn = new SumOfNumber();
		System.out.println("The sum of number is "+sn.calculateSum(num));
	}
	int calculateSum(int num){
		int i=0;
		for(int j=0;j<=num;j++){
			i = i+j;
		}
		return i;
	}
}