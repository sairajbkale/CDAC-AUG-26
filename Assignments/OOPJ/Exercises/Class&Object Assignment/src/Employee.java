
public class Employee {
	private String name;
	private int YearOfJoin;
	private int Salary;
	private String Address;
	
	Employee(String name,int YearOfJoin,int Salary,String Address){
		this.name = name;
		this.YearOfJoin = YearOfJoin;
		this.Salary = Salary;
		this.Address = Address;
	}
	
	void display() {
		System.out.println(name+"       "+YearOfJoin+"         "+Address+"      "+Salary);
	}
	
	public static void main(String []args) {
		System.out.println("Name    Year of Joining    Address       Salary");
		Employee elobj = new Employee("Jack",1994,1000,"64C-WallsStreat");
		Employee elobj1 = new Employee("Sam",2000,2000,"68D-WallsStreat");
		Employee elobj2 = new Employee("Jhon",1999,3000,"26B-WallsStreat");
		
		elobj.display();
		elobj1.display();
		elobj2.display();
	}
}
