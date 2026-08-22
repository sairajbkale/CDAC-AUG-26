import java.util.*;
class AvgOfArray{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter 5 integers ");
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int j=0;j<arr.length;j++){
			temp=temp+arr[j];
		}
		System.out.print("The average is "+(temp/arr.length));
	}
}