/**
 * 
 */

/**
 * @author sokol
 *
 */
public class Eggs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int num = 0; num < 130; num++){
			detect(num);
		}
	}
	public static void detect(int num)
	{
		if (num < 0)
		{
			System.out.println("�� ����� �������� ���������� ���");
		}
		else if (num >= 11 && num <= 14)
		{
			System.out.println(num + " ���.");
		}
		else if (num % 10 == 1)
		{
			System.out.println(num + " ����.");
		}
		else if ((num % 10 > 1) && (num % 10 < 5))
		{
			System.out.println(num + " ����.");
		}
		else
		{
			System.out.println(num + " ���.");
		}
		
	}

}
