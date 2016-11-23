package arabic.to.romain.number;
/**
 *
 */

import static org.junit.Assert.assertEquals;

import arabic.to.romain.number.RomanNumeralConverter;
import org.junit.Test;


public class RomanNumeralsTest {

	RomanNumeralConverter converter = new RomanNumeralConverter();
	
	@Test
	public void convertsToSingleI() {
		assertEquals("I", converter.convert(1));
	}
	
	@Test
	public void convertsToSingleV() {
		assertEquals("V", converter.convert(5));
	}
	
	@Test
	public void convertsToSingleX() {
		assertEquals("X", converter.convert(10));
	}
	
	@Test
	public void convertsToSingleL() {
		assertEquals("L", converter.convert(50));
	}
	
	@Test
	public void convertsToSingleC() {
		assertEquals("C", converter.convert(100));
	}
	
	@Test
	public void convertsToSingleD() {
		assertEquals("D", converter.convert(500));
	}
	
	@Test
	public void convertsToSingleM() {
		assertEquals("M", converter.convert(1000));
	}

	@Test
	public void repeatsASymbol() {
		assertEquals("II", converter.convert(2));
		assertEquals("XX", converter.convert(20));
		assertEquals("III", converter.convert(3));
	}
	
	@Test
	public void combinesMultipleSymbols() {
		assertEquals("XV", converter.convert(15));
		assertEquals("CLX", converter.convert(160));
	}
	
	@Test
	public void usesSubtractiveNotation() {
	   assertEquals("IV", converter.convert(4));
	   assertEquals("IX", converter.convert(9));
	   assertEquals("XL", converter.convert(40));
	   assertEquals("XC", converter.convert(90));
	   assertEquals("CD", converter.convert(400));
	   assertEquals("CM", converter.convert(900));
	}
	
	@Test
	public void convertsALargeNumber() {
		assertEquals("MMMMCMXCIX", converter.convert(4999));
	}
}
