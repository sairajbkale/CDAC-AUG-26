import java.util.*;
class PosAndNeg{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		System.out.print("Enter 6 integers ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int positive = 0;
		int negative = 0;
		for(int j=0;j<arr.length;j++){
			if(arr[j]>0){
			positive++;
			}
			else if(arr[j]<0){
			negative++;
			}
		}
		System.out.println("Positive Numbers "+positive);
		System.out.println("Negative Numbers "+negative);
	}
}