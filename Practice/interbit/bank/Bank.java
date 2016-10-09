package interbit.bank;

public class Bank {
	private final Bank bank = new Bank();
	private static Customer[] customers = new Customer[1000];
	
	private Bank(){
	//private constructor	
	}
	
	public static void addCustomer(Customer customer){
		int id = Integer.parseInt((customer.getId()));
		customers[id] = customer;
	}
	public static Customer getCustomer(int index){
		return customers[index];
	}
	public static int getNumOfCustomers(){
		int counter = 0;
		for (int i = 0; i < customers.length; i++){
			if (customers[i] != null)
			{
				counter++;
			}
		}
		return counter;
	}
	public Bank getBank(){
		return this.bank;
	}
}
