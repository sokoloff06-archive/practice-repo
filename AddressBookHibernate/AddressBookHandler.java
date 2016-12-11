import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddressBookHandler {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		AddressBook book = new AddressBook();
		while (true) {
			System.out.println("\nChoose what you would like to do (enter corresponding number):\n"
					+ "\n1. Create a new contact\n" + "2. Find a contact\n" + "3. List all contacts\n" + "4. Exit");
			int option;
			try {
				option = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Wrong input");
				scan.nextLine();
				continue;
			}
			switch (option) {
				case 1:
					System.out.println("\nEnter first name: ");
					String firstName = scan.next().toLowerCase();
					System.out.println("Enter last name: ");
					String lastName = scan.next().toLowerCase();
					System.out.println("Enter phone number: ");
					String phoneNum = scan.next().toLowerCase();
					if (book.addContactDB(firstName, lastName, phoneNum) != 0) {
						System.out.println("\nContact was successfully added");
					} else {
						System.out.println("\nThere is already a contact with the same primary info");
					}
					break;
				case 2:
					System.out.println("\nEnter any primary info of the contact you are looking for:");
					String filter = scan.next().toLowerCase();
					List<Person> found = book.search(filter);
					if (found.isEmpty()) {
						System.out.println("\nNo contacts have been found for your request");
					} else {
						int i = 1;
						for (Person p : found) {
							System.out.println(i++ + ". " + p.getFirstName() + " " + p.getLastName());
						}
						System.out.println("\nChoose contact (enter corresponding number): ");
						Person p = new Person();
						int choice;
						try {
							choice = scan.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("Wrong input");
							scan.nextLine();
							continue;
						}
						try {
							p = found.get(choice - 1);
						} catch (Exception e) {
							System.out.println("Wrong input");
							break;
						}
						System.out.println(p.getContactInfo());
						System.out.println("\nChoose what you would like to do (enter corresponding number):\n"
								+ "\n1. Edit contact\n" + "2. Delete contact\n" + "3. Return to the main Menu");
						option = scan.nextInt();
						switch (option) {
							case 1:
								//book.editContact();
								System.out.println("\nFunctionality is under developing");
								break;
							case 2:
								if (!book.delete(p)) {
									System.out.println("\nContact has not been deleted!");
								} else {
									System.out.println("\nContact has been successfully deleted");
								}
								break;
							case 3:
								break;
							default:
								System.out.println("\nInvalid input");
								break;
						}
					}
					break;
				case 3:
					List<Person> list = book.selectAll();
					if (list.isEmpty()) {
						System.out.println("\nNo contacts in this AddressBook");
					} else {
						int i = 1;
						for (Person p : list) {
							System.out.println(i++ + ". " + p.getFirstName() + " " + p.getLastName());
						}
					}
					break;
				case 4:
					System.exit(0);
			}
		}
	}
}
