package edX;

import java.util.Scanner;

public class AboutMe {
	
	private String name;
	private String school;
	private int age;
	
	AboutMe(String name, String school, int age)
	{
		this.name = name;
		this.school = school;
		this.age = age;
	}
	
	public String myName()
	{
		return this.name;
	}
	
	public String mySchool()
	{
		return this.school;
	}
	
	public int myAge()
	{
		return this.age;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Hello, user! Enter your name:");
		String name = scan.next();
		System.out.println("Your school:");
		String school = scan.next();
		System.out.println("Your age:");
		int age = scan.nextInt();
		scan.close();
		AboutMe user = new AboutMe(name, school, age);
		System.out.println("My name is " + user.myName() + ", and I attend " + user.mySchool() + ". I am " + user.myAge() + " years old.");
		
	}
	
}
