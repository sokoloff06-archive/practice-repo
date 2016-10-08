package Ex3_1;

import java.util.*;

/**
 * Created by Sokolov Vitaly on 27.09.2016.
 */
public class LengthAndLetters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		// scan.useDelimiter(".");
		System.out.print("Enter String: ");
		String ins = scan.next();
		char[] in = ins.toCharArray();
		int length = in.length;
		while (length < 1) {
			System.out.println("String should contain 1 or more symbols");
			System.out.print("Enter String: ");
			ins = scan.next();
			in = ins.toCharArray();
			length = in.length;
		}
		char first = in[0];
		char last = in[length - 1];
		System.out.println("Length: " + length + ", first symbol: " + first + ", last one: " + last);
	}
}