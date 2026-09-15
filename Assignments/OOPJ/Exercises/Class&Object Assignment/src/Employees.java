
public class Employees {
	private int Salary;
	private int NoOfHours;
	
	Employees(int Salary,int NoOfHours){
		this.Salary = Salary;
		this.NoOfHours = NoOfHours;
	}
	
	void getInfo(int Salary,int NoOfHours) {
		System.out.println("Salary : "+Salary+" No. Of Hours : "+NoOfHours);
	}
	
	int addSal(int Salary) {
		if(Salary<500) {
			return 10;
		}
		return 0;
	}
	
	int addWork(int NoOfHours) {
		if(NoOfHours >6) {
			return 5;
		}
		return 0;
	}
	
	void display() {
		System.out.print("Total Salary : "+(Salary+addWork(NoOfHours)+addSal(Salary)));
	}

	public static void main(String []args) {
		ConsoleInput cI = new ConsoleInput();
		
		System.out.print("Enter Salary : ");
		int Salary = cI.getInt();
		
		System.out.print("Enter Number of Hours : ");
		int NoOfHours = cI.getInt();
		
		Employees emobj = new Employees(Salary,NoOfHours);
		
		emobj.display();
	}
	
}
