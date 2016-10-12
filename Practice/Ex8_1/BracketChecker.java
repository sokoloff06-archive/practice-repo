package Ex8_1;

import java.util.Scanner;

public class BracketChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(System.getProperty("line.separator"));
		System.out.println("Enter String:");
		String a = scan.next();
		if (checkBrackets(a) == 0){
			System.out.println("Правильная расстановка скобок");
		}
		else if (checkBrackets(a) == 1){
			System.out.println("Присутствуют не закрытые скобки или лишние открывающие скобки");
		}
		else if (checkBrackets(a) == 2){
			System.out.println("Присутствуют не открытые скобки или лишние закрывающие скобки");
			}
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
}