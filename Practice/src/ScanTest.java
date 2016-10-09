package src;
import java.util.Scanner;

public class ScanTest {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String firstName, lastName;
		System.out.print("Enter your first name: ");
		firstName = scan.next();
		System.out.print("Enter your last name: ");
		lastName = scan.next();
		System.out.println("Hello, " + firstName + " " + lastName + "!");
	}

}
