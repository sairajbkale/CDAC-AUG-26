import java.util.*;

public class ExerciseTwo {
	public static void main(String []args) {
		ConsoleInput cI = new ConsoleInput();
		
		System.out.print("Enter the size of the array : ");  // Taking input for size of array
		int sizeofarr = cI.getInt();
		
		int [] numarray = new int[sizeofarr];  // Creating Integer Array
		
		System.out.print("Enter "+sizeofarr+" Array Elements ");  // Inserting Values into Array
		for(int i=0;i<sizeofarr;i++) {
			numarray[i] = cI.getInt();
		}
		Arrays.sort(numarray);  // Sorting Array
		
		System.out.print("Q2. Sorted Array Elements are :");  // Printing Sorted Array Values
		for(int i=0;i<sizeofarr;i++) {
			System.out.print(numarray[i]);
		}
		
		System.out.println();
		
		int sumofarr = 0;  
		for(int i=0;i<sizeofarr;i++) {  // Calculating Sum of Values of Array
			sumofarr += numarray[i];
		}
		System.out.print("Q3. Sum of Values of Array is :"+ sumofarr);
		
		System.out.println();
		
		System.out.print("Q4. Average of Values of Array is :"+ ((double)sumofarr/sizeofarr)); // Printing Avg of Values of Array
		
		System.out.println();
		
		int[] copyarray = new int[sizeofarr];  // Creating Another Array of Copy Values of Original Array
		for(int i=0;i<sizeofarr;i++) {
			copyarray[i] = numarray[i];  // Copying Values of Original Array(numarray) to New Array(copytarray) 
		}
		System.out.print("Q5. Values of Copy of Array are : ");
		for(int i=0;i<sizeofarr;i++) {
			System.out.print(copyarray[i]);
		}
		
		System.out.println();
		
		int min = numarray[0];
		int max = 0;
		
		for(int i=0;i<sizeofarr;i++) {  // Calculating Min and Max value of array
			if(numarray[i]<min) {
				min = numarray[i];
			}
			else if(numarray[i]>max) {
				max = numarray[i];
			}
		}
		System.out.print("Q6. The Max value of array is "+max+" and Min value of array is "+min);
		
		System.out.println();
		
		int[] revarray = new int[sizeofarr];  // Creating Array to store new values
		for(int i=0;i<sizeofarr;i++) {  // Storing the values of Original Array in Reverse Order
			revarray[i]=numarray[(sizeofarr-1)-i]; 
		}
		
		System.out.print("Q7. Reversing the Array : ");
		for(int i=0;i<sizeofarr;i++) {
			System.out.print(revarray[i]);
		}
		
		System.out.println();
		
		System.out.print("Q8/9. Duplicate Values of Array are :");
		for(int i=0;i<sizeofarr;i++) {  // Program to find duplicate values of an array
			for(int j=i+1;j<sizeofarr;j++) {
				if(numarray[i]==numarray[j]) {
					System.out.print(numarray[i]+" ");
					break;
				}
					}
				}
		
		System.out.println();
		
		int[] diffarray = new int[sizeofarr];
		System.out.print("Enter "+sizeofarr+" Array Elements ");  // Inserting Values into Array
		for(int i=0;i<sizeofarr;i++) {
			diffarray[i] = cI.getInt();
		}
		int temparr = 0;
		int[] temp = new int[sizeofarr];
		for(int i=0;i<sizeofarr;i++) {
			for(int j=0;j<sizeofarr;j++) {
				if(diffarray[i]==numarray[j]) {
					temp[i]=diffarray[i];
					temparr++;
				}
			}
		}
		for(int i=0;i<temparr-1;i++) {
			System.out.print(temp[i]);
		}
		
		
		
	}
}
