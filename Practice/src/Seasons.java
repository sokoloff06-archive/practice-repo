public class Seasons {
	
	
	public static final int MONTH_NUM = 5;
	public static final String MONTH_NAME = "December";
	
	
	
	public static void main(String[] args)
	{
/**		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter month number or name");
		String month = br.readLine();
		int month1  = br.readLine();
*/
		define(MONTH_NUM);
		define(MONTH_NAME);
	}
	public static void define(int month)
	{
		String season;
		switch(month)
		{
			case 1: season = "winter";
			break;
			case 2: season = "winter";
			break;
			case 3: season = "spring";
			break;
			case 4: season = "spring";
			break;
			case 5: season = "spring";
			break;
			case 6: season = "summer";
			break;
			case 7: season = "summer";
			break;
			case 8: season = "summer";
			break;
			case 9: season = "autumn";
			break;
			case 10: season = "autumn";
			break;
			case 11: season = "autumn";
			break;
			case 12: season = "winter";
			break;
			default: season = "Invalid month";
			break;
		}
		System.out.println(season);
	}
	public static void define(String month)
	{
		String season;
		switch(month)
		{
			case "December":	
			case "January":
			case "February": 
				season = "winter";
				break;
			case "Macrh": season = "spring";
			break;
			case "April": season = "spring";
			break;
			case "May": season = "spring";
			break;
			case "June": season = "summer";
			break;
			case "July": season = "summer";
			break;
			case "August": season = "summer";
			break;
			case "September": season = "autumn";
			break;
			case "October": season = "autumn";
			break;
			case "November": season = "autumn";
			break;
			default: season = "Invalid month";
			break;
		}
		System.out.println(season);
	}
}
