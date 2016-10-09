package interbit.bank;

public class TestCustomer {

	public static void main(String[] args) {
		Account acc = new Account("1", 0);
		Customer a = new Customer("Name", "1", 20, acc);
		Bank.addCustomer(a);
		a.getAccount().deposit(500);
		int num = Bank.getNumOfCustomers();
		Customer r = Bank.getCustomer(1);
		String custInfo = r.getName() + " " + r.getId() + " " + r.getAge();
		String accInfo = a.getAccount().getBalance() + " " + a.getAccount().getId();
		System.out.println("cust: " + custInfo + " acc: " + accInfo + " NumOfCust-s: " + num);
	}

}
