import java.util.*;

class ArrayElement{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int i = sc.nextInt();
		int[] a = new int[i];
		for(int j=0;j<i;j++){
			System.out.print("Enter "+(j+1)+" Element: ");
			int z = sc.nextInt();
			a[j]= z;
		}
		System.out.print("The elements of array is ");
		for( int numbers : a){
			System.out.print(numbers+" ");
		}
	}
}
		