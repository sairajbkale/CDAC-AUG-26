
class Rectangle{
	private float length;
	private float breadth;
	
	
	public Rectangle(float length,float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	float getrecperimeter() {
		return 2*(length+breadth);
	}
	
	float getrecarea() {
		return length*breadth;
	}
}

class Square extends Rectangle{
	private float side;

	public Square(float side) {
		super(side,side);
		this.side = side;
	}
	
	float getperimeter() {
		return 4*side;
	}
	
	float getarea() {
		return side*side;
	}
	
}

public class Shapes {
	
	public static void main(String []args) {
	Rectangle rec = new Rectangle(4,5);
	Square sq = new Square(4);
	
	System.out.println("The area is : "+rec.getrecarea()+" and perimeter is "+rec.getrecperimeter());
	System.out.println("The area is : "+sq.getarea()+" and perimeter is "+sq.getperimeter());
	
	}
}
