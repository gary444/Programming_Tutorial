import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static double inScore;
	public static double maxScore = 100.0;
	
	public static void main(String[] args) {
		
		double grade;
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Please enter the student's score in percent:");
			inScore = scan.nextDouble();
			
			//check percentage is valid
			if (inScore >= 0.0 && inScore <= 100.0) {
				
				if (inScore < 50.0) {
					
					System.out.println("Student has failed");
					grade = 5.0;
				}
				else {
					
					//if score percentage is above 95.0, cap at 95.0 anyway
					if (inScore > 95.0)
						inScore = 95.0;
					
					grade = 4.0 - ((inScore - 50.0) / 15.0);
					
				}
				
				
				//print grade
				System.out.print("Grade = ");
				DecimalFormat df = new DecimalFormat();
				df.setMaximumFractionDigits(1);
				df.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
				System.out.println(df.format(grade));
				System.out.println("\nThe student passed!\n");
				
			}
			else 
			{
				System.out.println("Error: entered score invalid");
			}
			
		}
		
		
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		
	}
}
