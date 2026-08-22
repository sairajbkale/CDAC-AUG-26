import java.util.*;
class Pallindrome{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1 = "";
		for(int i=str.length()-1;i>=0;i--){
			str1 = str1 + str.charAt(i);
		}
		if(str1.equals(str)){
			System.out.print("The string '" + str + "' is a palindrome.");
		}
		else{
			System.out.print("The string '" + str + "' is not a palindrome.");
		}
	}
}