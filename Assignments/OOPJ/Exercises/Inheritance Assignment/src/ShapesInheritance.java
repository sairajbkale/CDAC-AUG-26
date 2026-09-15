
class NewShape{
	
	void shapeprint() {
		System.out.println("This is Shape");
	}
}

class NewRectangle extends NewShape{
	void recprint() {
		System.out.println("This is Rectangle");
	}
	
	
}

class NewSquare extends NewRectangle{
	void sqrprint() {
		System.out.println("Square is a Rectangle");
	}
}

class NewCircle extends NewShape{
	void cirprint() {
		System.out.println("This is Circle");
	}
}

public class ShapesInheritance {
	public static void main(String []args) {
		NewSquare sq = new NewSquare();
		sq.recprint();
		sq.shapeprint();
		
	}
	
}
