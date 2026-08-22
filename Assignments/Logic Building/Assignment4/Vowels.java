import java.util.*;
class Vowels{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		int total = 0;
		for(int i=0;i<st.length();i++){
			if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u') {
				total = total + 1;
			}
		}
		System.out.print("The number of vowels in '"+st+"' is: "+total);
	}
}