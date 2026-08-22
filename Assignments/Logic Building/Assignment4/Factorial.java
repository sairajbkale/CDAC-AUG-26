import java.util.*;

class Factorial{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int N = sc.nextInt();
		int temp = 1;
		for(int i = 1;i<=N;i++){
			temp = temp * i;
		}
		System.out.print("The factorial is ");
		System.out.print(temp);
	}
}
