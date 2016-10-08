package Ex3_1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		System.out.print("Enter number to check: ");
		int num = scan.nextInt();
		int counter = countPrimes(num);
		System.out.print("Amount of prime numbers between 2 and " + num + " " + "is " + counter);
	}

	public static int countPrimes(int num) {
		int counter = 0;
		for (int i = num; i > 1; i--) {
			if (isPrime(i) == true) {
				counter++;
			}
		}
		return counter;
	}

	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = num - 1; i > 1; i--) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
}
