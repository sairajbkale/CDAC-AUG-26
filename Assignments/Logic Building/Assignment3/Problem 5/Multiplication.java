import java.util.*;
class Multiplication{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the table of Number: ");
		int num = sc.nextInt();
		Multiplication m = new Multiplication();
		m.printMultiplicationTable(num);
	}
	void printMultiplicationTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num + "x" + i + "=" + num*i);
		}
	}
}