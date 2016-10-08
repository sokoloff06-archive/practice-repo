package Ex3_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Vitaly Sokolov on 27.09.2016.
 */
public class Birthdate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your birth date in 'YYYY-DD-MM' format: ");
		String strDate = scan.nextLine();
		Date bdate = java.sql.Date.valueOf(strDate);
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		String weekday = sdf.format(bdate);
		System.out.println(weekday);
	}
}
