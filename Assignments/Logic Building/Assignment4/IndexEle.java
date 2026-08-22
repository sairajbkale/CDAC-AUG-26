import java.util.*;
class IndexEle{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter 5 integers ");
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
	}
	System.out.print("Enter the number to search ");
	int temp = sc.nextInt();
	Arrays.sort(arr);
	System.out.print("The number "+temp+" is found at indext "+ Arrays.binarySearch(arr,temp));
	}
}
