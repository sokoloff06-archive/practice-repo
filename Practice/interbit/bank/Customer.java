package interbit.bank;

public class Customer {
	private String name;
	private String id;
	private int age;
	private Account acc;

	public Customer() {
	}
	public Customer(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public Customer(String name, String id, int age, Account acc){
		this(name, id, age);
		this.acc = acc;
	}

	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}

	public int getAge() {
		return this.age;
	}
	public Account getAccount(){
		return this.acc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setAccount(Account acc){
		this.acc = acc;
	}
	
}
