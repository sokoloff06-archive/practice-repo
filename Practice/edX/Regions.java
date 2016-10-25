package edX;

import java.util.Scanner;

public class Regions {
	
	public static String getRegion(String region)
	{
		if (region == "GA")
		{
			return "Southeast";
		}
		if (region == "ME" || region == "VT" || region == "NH" || region == "MA" || region == "CT" || region == "RI"){
			return "New England";
		}
		else if (region == "NY" || region == "NJ" || region == "DE" || region == "MD" || region == "VA" || region == "NC" || region == "SC"){
			return "Atlantic";
		}
		else if (region == "GA" || region == "FL" || region == "MS" || region == "AL" || region == "LA" || region == "TN"){
			return "Southeast";
		}
		else if (region == "PA" || region == "OH" || region == "MI" || region == "MN" || region == "IL" || region == "WI" || region == "IA" || region == "KY" || region == "WV"){
			return "Midwest";
		}
		else if (region == "ND" || region == "SD" || region == "KS" || region == "NE" || region == "MO"){
			return "Great Plains";
		}
		else {
			return "Error!";
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter postal code of the state(format: 'XX'):");
		String input = scan.next();
		if (getRegion(input) == "Error!"){
			System.out.println("This is an invalid state abbreviation");
		}
		else{
			System.out.println("The state " + input + " is in the " + getRegion(input) + " region");
		}
	}

}
