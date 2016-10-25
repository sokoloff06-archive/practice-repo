package Ex10;

public class MultipleTable {

	public static void printWithoutFormat()
	{
		System.out.print("  ");
		for(int i=1; i< 10; i++)
			System.out.print(i + " ");
		
		System.out.println();
		
		for(int i=1; i< 10; i++)
		{
			System.out.print(i + " ");
			for(int j=1; j< 10; j++)
			{
				System.out.print(i*j + " ");				
			}
			System.out.println();
		}
	}
	
	public static void printWithFormat()
	{
		System.out.print("   ");
		for(int i=1; i< 10; i++)
			System.out.format("%3d", i);
		
		System.out.println();
		
		for(int i=1; i< 10; i++)
		{
			System.out.format("%3d", i);
			for(int j=1; j< 10; j++)
			{
				System.out.format("%3d", i*j);			
			}
			System.out.println();
		}
	}


	public static void main(String[] args) 
	{
		printWithoutFormat();
	
		System.out.println();
		System.out.println();
		
		printWithFormat();
		
	
	}

}
