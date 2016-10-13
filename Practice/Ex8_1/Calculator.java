package Ex8_1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String input;
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter expression:");
		input = scan.next();
		String inp = validate(input);
		if (inp == "1")
		{
			System.out.println("Input error!");
		}
		else {
			int res = calculate(inp);
			System.out.println(res);
		}
		
	}
	public static int calculate(String inp){
		//TODO stop cycle when it is finished
		int res = 0;
		try {
			res = Integer.parseInt(inp);
		}
		catch (NumberFormatException notReady){
			for (int i = 0; i < inp.length(); i++)
			{
				if (inp.charAt(i) == '+' || inp.charAt(i) == '-' || inp.charAt(i) == '*' || inp.charAt(i) == '/')
				{
					switch(inp.charAt(i))
					{
					case '+':
						res = getInt(inp, i - 1) + getInt(inp, i + 1);
						break;
					case '-':
						res = getInt(inp, i - 1) - getInt(inp, i + 1);
						break;
					case '/':
						res = getInt(inp, i - 1) / getInt(inp, i + 1);
						break;
					case '*':
						res = getInt(inp, i - 1) * getInt(inp, i + 1);
						break;
					}
				String newInp = inp.substring(0, i) + String.valueOf(res) + inp.substring(i + 1);
				calculate(newInp);
				}
			}
				
		}
		return res;
	}
	public static String validate(String input){
		if (checkBrackets(input) != 0)
		{
			System.out.println("Brackets error");
			return "1";
		}
		input = input.replace(" ", "");
		//TODO Handle non-digital input
		return input;
	}
	public static int checkBrackets(String a) 
	{
		char[] aArray = a.toCharArray();
		for (int i = 0; i < aArray.length; i++) 
		{
			if (aArray[i] == '(') 
			{
				int j = i;
				while (aArray[j] != ')') 
				{
					j++;
					if (j == aArray.length) 
					{
						return 1;
					}
				}
				aArray[j] = '0';
				aArray[i] = '0';
			}
			else if (aArray[i] == ')') 
			{
				return 2;
			}
		}
		return 0;
	}
	public static int getInt(String inp, int i){
		int res = Integer.parseInt(String.valueOf(inp.charAt(i)));
		return res;
	}
}
