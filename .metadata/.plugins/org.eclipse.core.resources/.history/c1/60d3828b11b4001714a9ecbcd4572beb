import java.util.Scanner;


public class Prime {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: write a method which tells you if a given number is a prime or not
		
		System.out.println("Enter an integer:");
		Scanner input = new Scanner(System.in);
		int inNum = input.nextInt();
		
		
		if (isPrime(inNum))
			System.out.println("PRIME");
		else 
			System.out.println("NOT PRIME");
			
		
		
	}
	
	private static boolean isPrime(int input){
		
		if(input < 2)
			return false;
		
		for (int i = 2; i < input; i++){
			if (input % i == 0)
				return false;
		}
			
		
		return true;
	}
	
}
