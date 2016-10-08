package Ex6;

public class MealCard {
	private static int curId = 1;
	private int id;
	private int balance;
	private String firstName;
	private String lastName;
	
	MealCard(int balance, String firstName, String lastName){
		this.id = curId++;
		this.balance = balance;
		if (firstName.isEmpty() == true){
			this.firstName = "Undefined";
		}
		else{
			this.firstName = firstName;
		}
		if (lastName.isEmpty() == true){
			this.lastName = "Undefined";
		}
		else{
			this.lastName = lastName;
		}
	}
	
	public int refill(int amount){
		this.balance += amount;
		return balance;
	}
	public int withdraw(int amount){
		if (amount > this.balance)
		{
			return -1;
		}
		else{
			this.balance -= amount;	
			return balance;
		}
	}
	public int getBalance(){
		return this.balance;
	}
	public String getName(){
		return this.firstName + " " + this.lastName;
	}
	public int getId(){
		return this.id;
	}
	
	
}
