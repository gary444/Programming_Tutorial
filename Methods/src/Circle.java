import java.util.Scanner;


public class Circle {
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Compute; diameter, circumference or area?");
		String choice = input.next();
		
		//print factor
		//System.out.println(choice + " = ");
		
		if (choice.equals("circumference")){
			
			calculateCircumference(getDiameter());
		}
		else if (choice.equals("diameter")) {
			
			calculateDiameter(getCircumference());
		}
		else if (choice.equals("area")) {
			
			calculateArea(getDiameter());
		}
		
	}
	
	private static double getDiameter(){
		
		System.out.println("Enter diameter:");
		Scanner input = new Scanner(System.in);
		return input.nextDouble();
	}
	
	/*private static double getArea(){
		
		System.out.println("Enter area:");
		Scanner input = new Scanner(System.in);
		return input.nextDouble();
	}*/
	
	private static double getCircumference(){
		
		System.out.println("Enter circumference:");
		Scanner input = new Scanner(System.in);
		return input.nextDouble();
	}
	
	private static void calculateDiameter(double circumference){
		
		System.out.println("Diameter = " + circumference + " / PI = " + (circumference / Math.PI));
		
	}
	
	private static void calculateArea(double diameter){
		
		System.out.println("Area = PI * (" + diameter + "/2)^2 = " + (Math.PI * Math.pow((diameter / 2.0), 2)));
	}
	
	private static void calculateCircumference(double diameter){
		
		System.out.println("Circumference = PI * " + diameter + " = " + (Math.PI * diameter));
	}
}

