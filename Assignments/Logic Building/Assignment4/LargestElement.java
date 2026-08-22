import java.util.*;
class LargestElement{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter 5 integers: ");
		for(int i = 0 ;i<5;i++){
			arr[i] = sc.nextInt();
		}
		
		// Manual Method
		/*int temp = arr[0];
		for(int j=0;j<5;j++){
			if(arr[j]>temp){
				temp = arr[j];
			}
		}*/
		
		// Inbuilt Method
		int n = Arrays.stream(arr).max().getAsInt();
		System.out.print("The largest element is: "+n);
	}
}