package entities;
import java.util.Scanner;
public class Patron {
	System.out.println("Please enter the patron ID:");
	Scanner input=new Scanner(System.in);
	String ID=input.nextLine();
	System.out.println("Please enter the patron first name:");
	String first=input.nextLine();
	System.out.println("Please enter the patron last name:");
	String last=input.nextLine();
	System.out.println("Please enter the patron address:");
	String add=input.nextLine();
	System.out.println("Please enter the patron email:");
	String email=input.nextLine();
}
