package edX;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = scan.nextInt();
		boolean res = isLeapYear(year);
		if (res == true)
		{
			System.out.println("The year " + year + " is a leap year.");
		}
		else
		{
			System.out.println("The year " + year + " is not a leap year.");
		}

	}
	public static boolean isLeapYear(int year)
	{
		if (year % 4 == 0)
		{
			if (year % 100 == 0 && year % 400 == 0)
			{
				return true;
			}
		}
		return false;
	}

}
