import java.util.*;
class AscOrd{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter 5 integers ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
}