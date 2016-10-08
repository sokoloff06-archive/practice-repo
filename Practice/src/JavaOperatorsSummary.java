/**
 * 
 */

/**
 * @author milen_000
 *
 */
public class JavaOperatorsSummary {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Arithmetic operators
	  		int x = -10;
	        int y = -20;
	 
	        int result = x + y;
	 
	        System.out.println("x + y = " + result);
	 
	        result = x - y;
	 
	        System.out.println("x - y = " + result);
	 
	        result = x * y;
	 
	        System.out.println("x * y = " + result);
	 
	        result = y / x;
	 
	        System.out.println("y / x = " + result);
	 
	        result = x % 3;
	 
	        System.out.println("x % 3 = " + result);
	        
	      // Unary operators
	        x = 10;
	        y = 20;
	 
	        result = +x;
	 
	        System.out.println("+x = " + result);
	 
	        result = -y;
	 
	        System.out.println("-y = " + result);
	 
	        result = ++x;
	 
	        System.out.println("++x = " + result);
	 
	        result = --y;
	 
	        System.out.println("++y = " + result);
	 
	        boolean ok = false;
	 
	        System.out.println(ok);
	 
	        System.out.println(!ok);
	        
	   //     Relational operators
	        x = 10;
	        y = 20;
	 
	        boolean res = x == y;
	 
	        System.out.println("x == y? " + res);
	 
	        res = x != y;
	 
	        System.out.println("x != y? " + res);
	 
	        res = x > y;
	 
	        System.out.println("x > y? " + res);
	 
	        res = x >= y;
	 
	        System.out.println("x >= y? " + res);
	 
	        res = x < y;
	 
	        System.out.println("x < y? " + res);
	 
	        res = x <= y;
	 
	        System.out.println("x <= y? " + res);
	        
	    //    Conditional operators
	         x = 10;
	         y = 20;
	 
	        if ((x > 8) && (y > 8)) {
	            System.out.println("Both x and y are less than 8");
	        }
	 
	        if ((x > 10) || (y > 10)) {
	            System.out.println("Either x or y is greater than 10");
	        }
	        
	        result = (x > 10) ? x : y;
	        
	        System.out.println("result 1 is: " + result);
	 
	        result = (y > 10) ? x : y;
	 
	        System.out.println("result 2 is: " + result);
	       
	        // Type comparison operator (instanceof)
	        String name = "Java";
	        
	        if (name instanceof String) {
	            System.out.println("an instance of String class");
	        }
	 
	        // test for subclass of Object
	        if (name instanceof Object) {
	            System.out.println("an instance of Object class");
	        }
	 
	        // test for subclass of an interface
	        if (name instanceof CharSequence) {
	            System.out.println("an instance of CharSequence interface");
	        }
	}

}
