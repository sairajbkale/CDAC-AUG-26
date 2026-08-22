import java.util.*;

class SumOfArray{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter 5 integers: ");
		for(int i=0;i<5;i++){
			arr[i] = sc.nextInt();
		}
		int j = 0;
		for(int i:arr){
			j = j+i;
		}
		System.out.print("The sum of all numbers is: "+j);
	}
}