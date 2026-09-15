
public class Student {
	private String name;
	private int roll_no;
	private String phone_no;
	private String address;
	
	Student(String name,int roll_no,String phone_no , String address){
		this.name = name;
		this.roll_no = roll_no;
		this.phone_no = phone_no;
		this.address = address;
	}
	
	void display() {
		System.out.println("Name :"+name+"\nRoll No."+roll_no+"\nPhone No."+phone_no+"\nAddress."+address+"\n");
	}
	
	public static void main(String []args) {
		Student student1 = new Student("Jhon",2,"9560086779","Mumbai");
		Student student2 = new Student("Sam",1,"8990677089","Kolkata");
		
		student1.display();
		student2.display();
		
	}

}
