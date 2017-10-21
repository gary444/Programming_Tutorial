import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
		double input;
		
		while(true){
			
			// get user input (accept floats as well as ints)
			System.out.print("Enter any number: ");
			input = scan.nextDouble();
			
			//truncate float to ints
			int intInput = (int)input;
			
			// print all positive odd numbers up to entered value
			for (int i = 1; i <= intInput; i += 2){
				
				System.out.print(i + " ");
			}
			
			System.out.println("");
		}
		
	}
	
}
