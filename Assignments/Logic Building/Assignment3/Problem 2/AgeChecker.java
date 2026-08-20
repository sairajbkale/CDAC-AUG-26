import java.util.*;

class AgeChecker{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		AgeChecker ac = new AgeChecker();
		System.out.println("The person is "+ac.checkAgeCategory(age));
	}
	String checkAgeCategory(int age){
		if(age<18){
			return "Minor";
		}
		else if(age>=18 && age<60){
			return "Ault";
		}
		else {
			return "Senior Citizen";
		}
	}
}