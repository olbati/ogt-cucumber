package arabic.to.romain.number;
/**
 *
 */

import java.util.Arrays;
import java.util.List;

public class RomanNumeralConverter {

	private List<RomanSymbol> symbols = Arrays.asList(
		new RomanSymbol(1000, "M"),
		new RomanSymbol(900, "CM"),
		new RomanSymbol(500, "D"),
		new RomanSymbol(400, "CD"),
		new RomanSymbol(100, "C"),
		new RomanSymbol(90, "XC"),
		new RomanSymbol(50, "L"),
		new RomanSymbol(40, "XL"),
		new RomanSymbol(10, "X"),
		new RomanSymbol(9, "IX"),
		new RomanSymbol(5, "V"),
		new RomanSymbol(4, "IV"),
		new RomanSymbol(1, "I")
	);
	
	public String convert(int val) {
		StringBuilder result = new StringBuilder();
		
		for (RomanSymbol symbol : symbols) {
			RomanSymbol maxRepetition = symbol.repeatUntilGreaterOrEqualTo(val);
			result.append(maxRepetition.symbol);
			val -= maxRepetition.value;
		}
		
		return result.toString();
	}
}
