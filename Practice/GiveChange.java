/* @author your_name
*/

import java.util.Scanner;

public class GiveChange {

  /** @param p number of pennies
  *   @return number of quarters
  */
  public static int getQuarters(int p) {
    int quarters = p / 25;
    return quarters;
  	
  }
  
  /** @param p number of pennies
  *   @param q number of quarters
  *   @return number of dimes
  */
  public static int getDimes(int p, int q) {
    int dimes = (p - q * 25) / 10;
    return dimes;
  }
  
  /** @param p number of pennies
  *   @param q number of quarters
  *   @param d number of dimes
  *   @return number of nickels
  */
  public static int getNickels(int p, int q, int d) {
  	int nickels = (p - q * 25 - d * 10) / 5;
    return nickels;
  }
  
  /** @param p number of pennies
  *   @param q number of quarters
  *   @param d number of dimes
  *   @param n number of nickels
  *   @return number of leftover pennies
  */
  public static int getPennies(int p, int q, int d, int n) {
  	int pennies = p - q * 25 - d * 10 - n * 5;
    return pennies;
  }
  
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    System.out.println("How much change is to be given?");
    double change = s.nextDouble();
    int pennies = (int)(change * 100);
    int q = getQuarters(pennies);
    int d = getDimes(pennies, q);
    int n = getNickels(pennies, q, d);
    int p = getPennies(pennies, q, d, n);
    String str = String.format("The customer should recieve %d " + 
                               "quarters, %d dimes, %d nickels, " + 
                               "and %d pennies.", q, d, n, p);
  	System.out.println(str);
  }

}