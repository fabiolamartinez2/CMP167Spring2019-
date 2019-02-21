// Fabiola Martinez
//MPc 167


import java.util.Scanner;

public class Agetitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scnr = new Scanner(System.in);
    int userAge;
    
    
    System.out.print("Enter age: ");
    userAge = scnr.nextInt();
    
    if (userAge > 25) { 
    	System.out.println("Adult");
    } else if (userAge >= 19 && userAge <= 25) {
    	System.out.println("Young adult");
    } else {
    	System.out.println ("Teen"); 
    			
    }
     System.out.println(" The user is a: ");
    
	} 

}
