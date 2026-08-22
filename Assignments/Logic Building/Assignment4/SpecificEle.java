import java.util.*;
class SpecificEle{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[5];
		System.out.print("Enter 5 integers ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the number to search ");
		int temp = sc.nextInt();
		List<Integer> list = Arrays.asList(arr);
		for(int i:list){
			if(i==temp){
				System.out.print("Found");
			}
		}
	}
}