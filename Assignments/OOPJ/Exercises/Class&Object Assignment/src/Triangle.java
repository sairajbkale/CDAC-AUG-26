public class Triangle{
	private double side1;
	private double side2;
	private double side3;
	
	Triangle(double side1,double side2,double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	double perimeter() {
		return side1+side2+side3;
	}
	
	double area() {
		double halfperimeter = (perimeter())/2;
		double trianglearea = Math.sqrt(halfperimeter*(halfperimeter-side1)*(halfperimeter-side2)*(halfperimeter-side3));
		return trianglearea;
	}
	
	public static void main(String []args) {
		
		Triangle tri = new Triangle(3,4,5);
		
		System.out.println("The Perimeter of triangle is : "+tri.perimeter());
		System.out.println("The Area of triangle is : "+tri.area());
	}
}