import java.util.Scanner;

//beginner

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int sum = 0;
		
		//todo: Read integer values as input and add them until the user writes a 's'.
		//Print the result.
        
        System.out.println("Enter integer values or press 's' to print the sum:");
        String input = scan.next();
        
        while (!input.equals("s")){

            try {
                int num = Integer.parseInt(input);
                sum += num;
            }
            catch (NumberFormatException e){
                System.out.println("Invalid Response.");
            }


            input = scan.next();
        }
        
        
        System.out.println("Sum = " + sum);
		
	}
	
}
