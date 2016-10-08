package Ex3_1;

import java.util.Scanner;

public class MiddleCharacter {

	public static void main(String[] args) {
		findMiddleCharacter();
	}

	public static void findMiddleCharacter() {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		System.out.print("Input a word with odd number of characters:");
		String text = scan.nextLine();
		int length = text.length();
		if (length % 2 == 1) {
			char answer = text.charAt(length / 2 + 1);
			System.out.println("Middle character is " + answer);
		} else {
			findMiddleCharacter();
		}
	}
}
