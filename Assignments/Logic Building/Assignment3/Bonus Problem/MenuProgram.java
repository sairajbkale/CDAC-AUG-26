import java.util.*;

class MenuProgram{
	
	// Grade Program Method
	String grade(int Maths,int Science , int History){
		int result = (Maths+Science+History)/3;
		if(result>=90){
			return "Grade A";
		}
		else if(result>70 && result < 90){
			return "Grade B";
		}
		else if(result > 50 && result < 70){
			return "Grade C";
		}
		else if(result > 30 && result < 50){
			return "Grade D";
		}
		else{
			return "Fail";
		}
	}
	
	// Leap Year Program Method
	String leapYear(int Year){
		if((Year%4==0 && Year%100!=0) || (Year%400==0)){
			return "It is the leap year ";
		}
		else{
			return "It is not the leap year ";
		}
	}
	
	// Day of the Week Program Method
	String dayOfWeek(int Day){
		switch(Day){
			case 1:
			return "Monday";
			
			
			case 2:
			return "Tuesday";
			
			
			case 3:
			return "Wednesday";
			
			
			case 4:
			return "Thursday";
			
			
			case 5:
			return "Friday";
			
			
			case 6:
			return "Saturday";
			
			
			case 7:
			return "Sunday";
			
			
			default:
			return "Invalid Number";
			
		}
	}
	
	// Program to display Uninitialized Value
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		boolean h;
	void uninitializedValues(){
		MenuProgram mp = new MenuProgram();
		System.out.println(mp.a);
		System.out.println(mp.b);
		System.out.println(mp.c);
		System.out.println(mp.d);
		System.out.println(mp.e);
		System.out.println(mp.f);
		System.out.println(mp.g);
		System.out.println(mp.h);
	}
	
	public static void main(String []args){
		MenuProgram mp = new MenuProgram();
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("Problem 1: Grade Evaluation System");
		System.out.println("Problem 2: Leap Year Check");
		System.out.println("Problem 3: Day of the Week");
		System.out.println("Problem 4: Identify Deault Values of Variables");
		System.out.println("5.Exit");
		int a=0;
		while(a==0){
			System.out.print("Select the Problem ");
			int problem = sc.nextInt();
			
			switch(problem){
				case 1:
				int Maths,Science,History;
				System.out.print("Enter Maths Marks ");
				Maths = sc.nextInt();
				System.out.print("Enter Science Marks ");
				Science = sc.nextInt();
				System.out.print("Enter History Marks ");
				History = sc.nextInt();
				System.out.println(mp.grade(Maths,Science,History));
				break;
				
				case 2:
				int Year;
				System.out.print("Enter the Year ");
				Year = sc.nextInt();
				System.out.println(mp.leapYear(Year));
				break;
				
				case 3:
				int Day;
				System.out.print("Enter the Number ");
				Day = sc.nextInt();
				System.out.println(mp.dayOfWeek(Day));
				break;
				
				case 4:
				mp.uninitializedValues();
				break;
				
				case 5:
				a++;
				break;
				
				default:
				System.out.println("Invalid Option");
		}
		}
	}
}
				