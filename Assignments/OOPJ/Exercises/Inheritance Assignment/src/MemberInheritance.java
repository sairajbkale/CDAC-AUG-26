
class Member{
	private String Name;
	private int Age;
	private String PhoneNo;
	private String Address;
	private float Salary;
	
	void setDetails(String Name,int Age,String PhoneNo,String Address,float Salary) {
		this.Name = Name;
		this.Age = Age;
		this.PhoneNo = PhoneNo;
		this.Address = Address;
		this.Salary = Salary;
	}
	
	void printSalary() {
		System.out.print(" Name : "+Name+"\n Age : "+Age+"\n Phone No : "+PhoneNo+"\n Address : "+Address+"\n Salary : "+Salary);
	}
}

class PrimeMembers extends Member{
	private int JoiningYear;
	private float JoiningFees;
	private boolean isActive;
	
	void setPrimeDetails(int JoiningYear,float JoiningFees,boolean isActive) {
		this.JoiningYear = JoiningYear;
		this.JoiningFees = JoiningFees;
		this.isActive = isActive;
	}
	
	void display() {
		System.out.print("\n Joining Year : "+JoiningYear+"\n Joining Fees : "+JoiningFees+"\n Is Active : "+ isActive);
	}
}

public class MemberInheritance {
	
	public static void main(String []args) {
		ConsoleInput cI = new ConsoleInput(); 
		
		String Name;
		int Age;
		String PhoneNo;
		String Address;
		float Salary;
		
		System.out.print("Enter Name : ");
		Name = cI.getString();
		
		System.out.print("Enter Age : ");
		Age = cI.getInt();
		
		System.out.print("Enter Phone No : ");
		PhoneNo = cI.getString();
		
		System.out.print("Enter Address : ");
		Address = cI.getString();
		
		System.out.print("Enter Salary : ");
		Salary = cI.getFloat();
		
		Member meb = new Member();
		meb.setDetails(Name,Age,PhoneNo,Address,Salary);
		
		int JoiningYear;
		float JoiningFees;
		boolean isActive;
		
		System.out.print("Enter Joining Year : ");
		JoiningYear = cI.getInt();
		
		System.out.print("Enter Joining Fees : ");
		JoiningFees = cI.getFloat();
		
		System.out.print("Is Employee Active ");
		isActive = cI.getBool();
		
		PrimeMembers pm = new PrimeMembers();
		pm.setPrimeDetails(JoiningYear,JoiningFees,isActive);
		
		meb.printSalary();
		pm.display();
	}
}


