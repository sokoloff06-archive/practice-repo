package edX;

import java.util.Scanner;

public class Associative {

	private int x;
	private int y;
	private int z;
	
	Associative(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter 1st number:");
		int x = scan.nextInt();
		System.out.println("Enter 2nd number:");
		int y = scan.nextInt();
		System.out.println("Enter 3rd number:");
		int z = scan.nextInt();
		scan.close();
		Associative numbers = new Associative(x, y, z);
		System.out.println("Grouping the first two terms, (" + x + " + " + y + ") * " + z + " = " + numbers.firstTwo());
		System.out.println("Grouping the last two terms, " + x + " + (" + y + " * " + z + ") = " + numbers.lastTwo());
	}
	
	public int firstTwo()
	{
		int res = (x + y) * z;
		return res;
	}
	
	public int lastTwo()
	{
		int res = x + (y * z);
		return res;
	}

}
