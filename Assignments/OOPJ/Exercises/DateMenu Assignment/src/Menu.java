
public class Menu {
	
	public static void main(String []args) {
		ConsoleInput InputObject = new ConsoleInput();
		DateFunctions DateFuncObject = new DateFunctions();
		int day ;
		int month ;
		int year ;
		
		
		System.out.println("1.Set Date");
		System.out.println("2.Add Days");
		System.out.println("3.Add Months");
		System.out.println("4.Add Years");
		System.out.println("5.Display");
		System.out.println("6.Compare Dates");
		System.out.println("7.Exit");
		
		boolean whileCondition = true;
		// Menu Program
		while(whileCondition) {
			System.out.println("Enter Your Option : ");
			int option = InputObject.getInt();
			switch(option) {
			case 1:
				day = InputObject.getInt();
				month = InputObject.getInt();
				year = InputObject.getInt();
				DateFuncObject.setDate(day,month,year);
				break;
			case 2:
				day = InputObject.getInt();
				DateFuncObject.addDays(day);
				break;
			case 3:
				month = InputObject.getInt();
				DateFuncObject.addMonths(month);
				break;
			case 4:
				year = InputObject.getInt();
				DateFuncObject.addYears(year);
				break;
			case 5:
				DateFuncObject.display();
				break;
			case 6:
				System.out.println("Enter New Date to Compare with : ");
				int newDay = InputObject.getInt();
				int newMonth = InputObject.getInt();
				int newYear = InputObject.getInt();
				DateFuncObject.compareDate(newDay,newMonth,newYear);
				break;
			case 7:
				System.out.println("Program Exited Succesfully");
				whileCondition = false;
				break;
			default:
				System.out.println("Wrong Input");
			}
		}
		
	}
}
