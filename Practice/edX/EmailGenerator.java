package edX;

import java.util.Scanner;

public class EmailGenerator {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first and last name:");
		String firstName = scan.next();
		String lastName = scan.next();
		String domain = "purdue.com";
		String email = makeEmail(makeUserName(firstName, lastName), domain);
		System.out.println("This user's e-mail is: " + email);
	}
	public static String makeUserName(String firstName, String lastName)
	{
		String res = firstName.substring(0, 1) + lastName;
		return res.toLowerCase();
	}
	public static String makeEmail(String name, String domain)
	{
		return name + "@" + domain;
	}
}