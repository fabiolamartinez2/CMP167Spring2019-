/*
 * Fabiola Martinez
 * This program implements area function/method
 */



import java.util.Scanner;
public class Area {
	static Scanner keyboard = new Scanner(System.in);

	public static void rectArea() {
	int width, length, area;
	System.out.println("Let's calculate area");
		
    System.out.println("Enter width: ");
    width = keyboard.nextInt();
    
    System.out.print("Enter length: ");
    length = keyboard.nextInt();
    area = width * length;
    System.out.println("The rect area is: " + area);
    		
	
	
	} //Circle area
	
	public static void circArea() {
		double radius;
		double area;
		
		System.out.println("Let's calculate area");
		
		System.out.println(" Enter radius: ");
		radius = keyboard.nextInt();
		 area = radius * radius * 3.14;
		 System.out.println(" The rect area is: " + area);
		
		
	} // traingle area
	
	public static void trainArea() {
		int height, base, area;
   System.out.println("Let's calculate area");
	
   System.out.println("Enter height: ");
   height = keyboard.nextInt();
   System.out.println("Enter base: ");
   base = keyboard.nextInt();
   area = (height * base)/2;
   System.out.println(" The rect area is: " + area);
		   
	}
	
	public static void main(String[] args) {
		rectArea();
		circArea();
		trainArea();
		
	
	}
}
