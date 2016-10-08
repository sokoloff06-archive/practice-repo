/**
 *
 */
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author milen_000
 *
 */
class DateManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// The Date class is used to represent a time instance to a millisecond (one-thousandth of a second) precision.
		Date today;
		today = new Date() ;
		System.out.println(today.toString());

		//  we want to display the month, day, and year in the MM/dd/yy shorthand format, such as 07/04/08
		SimpleDateFormat sdf1;
		sdf1   = new SimpleDateFormat("MM/dd/yy");
		System.out.println(sdf1.format(today));

		//  to display which day of the week today is, we can use the letter E
		SimpleDateFormat sdf2;
		sdf2   = new SimpleDateFormat("EEEE");
		System.out.println("Today is " + sdf2.format(today));

		//Programmer-designated long format display
		SimpleDateFormat simpleDF1 = new SimpleDateFormat ("EEEE MMMM dd, yyyy");
		System.out.println("Today is " + simpleDF1.format(today)) ;
	}

}
