package arabic.to.romain.number;
/**
 *
 *
 */

import com.google.common.base.Strings;

public class RomanSymbol {

	int value;
	String symbol;
	
	RomanSymbol(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}

	public RomanSymbol repeatUntilGreaterOrEqualTo(int val) {
		int numTimes = val / value;
		return new RomanSymbol(numTimes * value, Strings.repeat(symbol, numTimes));
	}
}
