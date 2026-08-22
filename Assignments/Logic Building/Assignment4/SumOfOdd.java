import java.util.*;

class SumOfOdd{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		int temp = 0;
		for(int i=1;i<=N;i++){
			if(i%2!=0){
				temp = temp + i;
			}
		}
		System.out.print("The sum of odd numbers is "+temp);
	}
}