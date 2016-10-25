//  a short program that selects a winner among the party goers of the annual spring fraternity dance. 
// The party goers will receive numbers M + 1, M + 2, M + 3, and so on, as they enter the house. 
// The starting value M is determined by the fraternity president. The last number assigned is M + N if there are N party goers. 
// At the end of the party, we run the program that will randomly select the winning number from the range of M + 1 and M + N. 

package Ex10;
import java.util.Random;
import java.util.Scanner;

public class RandomSample {

	
	public static void main(String[] args) {
		
		int startingNumber; 	//the starting number 
		int count; 				//the number of party goers 
		int winningNumber; 		//the winner 
		int min, max; 			//the range of random numbers to generate
		
		Random random = new Random(); //random number generator
		Scanner scan = new Scanner(System.in);
		//Get two input values 
		System.out.print("Enter the starting number M:     "); 
		startingNumber = scan.nextInt ();
		
		System.out.print("Enter the number of party goers: "); 
		count = scan.nextInt();
		
		//select the winner 
		min = startingNumber + 1; 
		max = startingNumber + count;
		winningNumber = random.nextInt(max-min+1) + min;
		System.out.println("\nThe Winning Number is " + winningNumber);

		scan.close();

	}

}
