
class Parent{
	
	void pdisplay() {
		System.out.println("This is parent class.");
	}
}

class Child extends Parent{
	
	void cdisplay() {
		System.out.println("This is child class.");
	}
}


public class ParentInheritance{
	public static void main(String []args) {
		Parent p = new Parent();
		Child c = new Child();
		
		p.pdisplay();
		c.cdisplay();
		c.pdisplay();
	}
}