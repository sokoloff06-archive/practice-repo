package Ex3_1;

import java.util.Scanner;

public class NameFormatting {
	public static void main(String[] args) {
		String oldName = getName();
		System.out.println(formatName(oldName));
	}

	public static String getName() {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		System.out.print("Input your name in format 'First Middle Last': ");
		String oldName = scan.next();
		return oldName;
	}

	public static String formatName(String oldName) {
		String first = oldName.substring(0, oldName.indexOf(" "));
		String last = oldName.substring(oldName.lastIndexOf(" ") + 1);
		String middle = oldName.substring(oldName.indexOf(" ") + 1, oldName.indexOf(" ") + 2);
		String newName = last + ", " + first + " " + middle + ".";
		return newName;
	}
}
