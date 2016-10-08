import java.util.Date;

public class Customer
{
	private int id;
	private String fullName;
	private String country = "Israel";
	private Date birthDate;
	private float balance;
	private boolean gender;
	
	
	private float getBalance()
	{
		return balance;
	}
	public String[] getCustomerInfo()
	{
		String num = Integer.toString(id);
		String customerInfo[] = {num, fullName, country};
		return customerInfo;
	}
	public void setName(String newName)
	{
		fullName = newName;
	}
	private void makePurchase(int price)
	{
		balance -= price;
	}
	public String getGender()
	{
		if (gender == true)
		{
			return "Male";
		}
		else
		{
			return "Female";
		}
	}
}