package interbit.bank;

public class Account {
	private String id;
	private double balance;
	private int typeOfAccount;
	private final int CHECKING_ACCOUNT = 1;
	private final int BUSINESS_ACCOUNT = 2;
	private final double COMMISSION = 0.05;
	private static int currId = 1;
	
	
	public Account(String id, double balance){
		this.id = String.valueOf(currId++);
		this.balance = balance;
	}
	
	public String getId() {
		return this.id;
	}
	public double getBalance(){
		return this.balance;
	}
	public int getTypeOfAccount(){
		return this.typeOfAccount;
	}
	public void setTypeOfAcoount(int typeOfAccount){
		this.typeOfAccount = typeOfAccount;
	}
	public void deposit(double amount){
		this.balance += amount; 
	}
	public double withdraw(double amount){
		this.balance -= (1 + COMMISSION) * amount;
		return this.balance;
	}
}
