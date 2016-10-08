/**
 * 
 */

/**
 * Bit flags, commonly referred to as Bit fields are an efficient way of storing several related boolean values in a single primitive type. 
 * Internally represented in binary, you can decide on how large the storage type needs to be - for example, 
 * a Java integer will provide you with space for 31 flags. 
 * Being a 32 bit type you would assume to have access to this many flags, 
 * however, due to it being a signed value the most significant bit is reserved to store its +/- sign.
 *
 */
public class BitFlags {

	public static String format(String value, String flags)
	{
	    if (flags == "UPPERCASE") value = value.toUpperCase();

	    if (flags == "REVERSE") value = new StringBuffer(value).reverse().toString();

	    if (flags == "FULL_STOP") value += ".";

	    if (flags == "EMPHASISE") value = "~*~ " + value + " ~*~";

	    return value;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		format("Joe", "UPPERCASE"); // JOE

		format("Joe", "REVERSE"); // eoJ

		format("Joe", "FULL_STOP"); // ~*~ Joe. ~*~

		format("Joe", "EMPHASISE"); // ~*~ Joe ~*~

	}

}
