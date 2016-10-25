package Ex10;

import java.util.Formatter;
import java.util.Locale;

public class FormatterSamples {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		   // Send all output to the Appendable object sb
		//   Formatter formatter = new Formatter(sb, Locale.US);
		   Formatter formatter = new Formatter(sb, Locale.forLanguageTag("RU"));

		   // Explicit argument indices may be used to re-order output.
		   formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
		   // -> " d  c  b  a"
		   sb.append("\n");
		   
		   // Optional locale as the first argument can be used to get
		   // locale-specific formatting of numbers.  The precision and width can be
		   // given to round and align the value.
		   formatter.format(Locale.FRANCE, "e = %+10.4f", Math.E);
		   // -> "e =    +2,7183"
		   sb.append("\n");
		   
		   // The '(' numeric flag may be used to format negative numbers with
		   // parentheses rather than a minus sign.  Group separators are
		   // automatically inserted.
		   float balanceDelta = -6217.55f;		   
		   formatter.format("Amount gained or lost since last statement: $ %(,.2f", balanceDelta);
		   // -> "Amount gained or lost since last statement: $ (6,217.58)"
		   sb.append("\n");
		   
		   double positiveDelta = +8769.99776;
		   formatter.format("Positive Delta: $ %(,.2f", positiveDelta);
		   
		   System.out.println(sb);
		   
		   formatter.close();
	}

}
