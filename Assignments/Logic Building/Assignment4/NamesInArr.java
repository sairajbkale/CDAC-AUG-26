import java.util.*;

class NamesInArr{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[4];
		System.out.print("Enter 4 names: ");
		for(int i=0;i<4;i++){
			arr[i] = sc.next();
		}
		System.out.print("The names are: \n");
		for(String i: arr){
			System.out.println(i);
		}
	}
}