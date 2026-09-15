
public class Pattern {
	public static void main(String []args) {
		consoleInput cI = new consoleInput();
		MenuDisplay mD = new MenuDisplay();
		mD.getMenuDisplay();
		
		System.out.print("Choose the option : ");
		int option = cI.getInt();
		
		switch(option) {
		case 1:
			System.out.println("Q1.Using for loops write a java program to display all odd numbers from 1 to 1000");
			for (int i=1;i<=1000;i++) {
				if(i%2!=0) {
					System.out.print(i+" ");
				}
			}
			break;
			
		case 2:
			System.out.println("Q2. Using for loops write a Java Program to display all even numbers from 1 to 500");
			for (int i=1;i<=500;i++) {
				if(i%2==0) {
					System.out.print(i+" ");
				}
			}
			break;
			
		case 3:
			System.out.println("Q3. Using for loops write a Java Program to display 7th number from 1 to 200");
			for(int i=1;i<=200;i++) {
				if(i%7==0) {
					System.out.print(i+" ");
				}
			}
			break;
			
		case 4:
			System.out.println("Q4. Using for loops write a Java Program to display Right Angle Triangle Star Pattern");
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
			
		case 5:
			System.out.println("Q5. Using for loops write a Java Program to display Inverse Right Angle Triangle Star Pattern");
			for(int i=5;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
			
		case 6:
			System.out.println("Q6. Using for loops write a Java Program to display Right Angle Triangle Number Pattern");
			int num = 1;
			for(int i=1;i<=4;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(num+" ");
					num++;
				}
				System.out.println();
			}
			break;
			
		case 7:
			System.out.println("Q7. Using for loops write a Java Program to display Right Angle Triangle Number Pattern");
			for(int i=1;i<=6;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			break;
			
		case 8:
			System.out.println("Q8. Using for loops write a Java Program to display Inverse Right Angle Triangle Number Pattern");
			for(int i=6;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
		default:
			break;
		}
		
		
		
		
		
		
		
		
		
	}
}
