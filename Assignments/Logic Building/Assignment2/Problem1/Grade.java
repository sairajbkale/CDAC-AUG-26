//Grade Evaluation System
import java.util.*;

public class Grade{
	public static void main(String []args){
	Scanner s = new Scanner(System.in);
	System.out.println("Marks in Math ");
	int Math = s.nextInt();

	System.out.println("Marks in Science ");
	int Science = s.nextInt();

	System.out.println("Marks in History ");
	int History = s.nextInt();

	int avg = (Math+Science+History)/3;
	if(avg >= 90){
		System.out.println("Grade A");
}	
	else if(avg >= 70 && avg < 90){
		System.out.println("Grade B");
}
	else if(avg >= 50 && avg < 70){
		System.out.println("Grade C");
}
	else if(avg >= 30 && avg < 50){
		System.out.println("Grade D");
}
	else if(avg < 30){
		System.out.println("Fail");
}
	
}	
}