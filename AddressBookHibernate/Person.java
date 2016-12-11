import java.io.Serializable;

class Person implements Serializable {


	private int id;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String city;
	private String street;
	private int bld;
	private int zip;

	public Person(String firstName, String lastName, String phoneNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
	}

	public Person(int id, String firstName, String lastName, String phoneNum) {
		this(firstName, lastName, phoneNum);
		this.id = id;
	}

	public Person() {
	}

	int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	String getContactInfo() {
		return "\n#############################\n"
				+ "First Name: " + this.firstName + "\n"
				+ "Last Name: " + this.lastName + "\n"
				+ "Phone Number: " + this.phoneNum + "\n"
				+ "ZIP-code: " + this.zip + "\n"
				+ "City: " + this.city + "\n"
				+ "Street: " + this.street + "\n"
				+ "Building: " + this.bld + "\n"
				+ "#############################";
	}


}
