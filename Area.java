/*
 * Fabiola Martinez
 * This program implements area function/method
 */



import java.util.Scanner;
public class Area {
	static Scanner keyboard = new Scanner(System.in);

	public static int getRecArea(int width, int length){
	return width * length;
	
	} //Circle area
	
	public static double getCircleArea(double radius, double area ) {
		return radius * radius * 3.13;
		
	} // traingle area
	
	public static int getTriangleArea( int base, int height) {
		
		   return ((base* height)/2);
	}
	
	public static void main(String[] args) {
		rectArea();
		circArea();
		trainArea();
		System.out.println("Enter width and length: ");
	   int width = keyboard.nextInt();
	    int length = keyboard.nextInt();
	    int area = getRecArea (width, length);
	    
	    System.out.printlm("Area: " + area);
	    
	    
	    
	    
	}
}