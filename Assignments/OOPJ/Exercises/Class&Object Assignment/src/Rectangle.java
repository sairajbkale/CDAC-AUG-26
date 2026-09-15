
public class Rectangle {
	private double length;
	private double breadth;
	
	
	Rectangle(double length,double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	void area() {
		double recarea = length*breadth;
		System.out.println("The Area of Rectangle is "+recarea+" and Length is "+length+" and breadth is "+breadth);
	}
	
	public static void main(String []args) {
		Rectangle rectemp1 = new Rectangle(4,5);
		Rectangle rectemp2 = new Rectangle(5,8);
		
		rectemp1.area();
		rectemp2.area();
	}
}
