//TODO Обработать все случаи некорректного ввода
package Ex6;

import java.util.Scanner;

public class MealCardTest {
	static MealCard[] cards = new MealCard[100];
	static int cardsCounter = 0;

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		System.out.println("What do you want to do? (Input only one number):");
		System.out.println("1 - Create new MealCard");
		System.out.println("2 - Get Balance");
		System.out.println("3 - Make Purchase");
		System.out.println("4 - Refill Meal Card");
		System.out.println("5 - Exit programm");
		int in = scan.nextInt();
		switch (in) {
		case 1:
			createCard();
			menu();
		case 2:
			System.out.println("Enter ID of the desired card:");
			int id = scan.nextInt();
			int balance = getBalance(id);
			System.out.println("Balance of card N " + id + " is " + balance + ".");
			menu();
		case 3:
			makePurchase();
			menu();
		case 4:
			refillCard();
			menu();
		case 5:
			exit();
		}
	}

	public static void createCard() {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter data or leave default values:\nFirst Name (Undefined):");
		String firstName = scan.next();
		System.out.println("Last Name (Undefined):");
		String lastName = scan.next();
		System.out.println("Balance (100):");
		String balance_str = scan.next();
		int balance = Integer.parseInt(balance_str);
		cards[cardsCounter] = new MealCard(balance, firstName, lastName);
		System.out.println("New MealCard created." + "\nID = " + cards[cardsCounter].getId() + "\nBalance = " + cards[cardsCounter].getBalance() + "\nName = " + cards[cardsCounter].getName());
	}

	public static int getBalance(int id) {
		int balance = cards[id - 1].getBalance();
		return balance;
	}

	public static void makePurchase() {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter the price of desired item: ");
		int price = scan.nextInt();
		System.out.println("Enter the ID of card to transact payment: ");
		int id = scan.nextInt();
		if (price > cards[id - 1].getBalance()) {
			System.out.println("Balance is not enough for this transaction.");
		} else {
			int balance = cards[id - 1].withdraw(price);
			System.out.println("Successful payment. Now balance is " + balance + ".");
		}
	}

	public static void refillCard() {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter the desired amount of refilling: ");
		int amount = scan.nextInt();
		System.out.println("Enter the ID of card to refill: ");
		int id = scan.nextInt();
		int balance = cards[id - 1].refill(amount);
		System.out.println("Refilling is succesful. New balance is " + balance + ".");
	}
	public static void exit(){
		System.out.println("Goodbye!");
		System.exit(0);
	}
}
