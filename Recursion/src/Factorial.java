import java.util.Scanner;


public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	
	public static void main(String[] args){
		
		Scanner inScan = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = inScan.nextInt();
		
		System.out.println("Factorial of " + num + " = " + factorial(num));
	}
	
	private static int factorial(int input){
		
		if (input == 1)
			return input;
		else
			return (input * factorial(input - 1));
	}
}
