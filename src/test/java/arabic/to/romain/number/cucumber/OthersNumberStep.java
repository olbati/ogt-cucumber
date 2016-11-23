package arabic.to.romain.number.cucumber;

import arabic.to.romain.number.RomanNumeralConverter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class OthersNumberStep {

    RomanNumeralConverter converter = new RomanNumeralConverter();
    Integer arabicNumber;
	@Given("I have supplied the 4999 arabic number (\\d+)$")
	public void the_menu_contains_the_following_dishes(final Integer arabicNumber) {
        this.arabicNumber=arabicNumber;
	}

	@When("I ask for the 4999 roman numerals")
	public void the_customer_order() {

	}

	@Then("the result should be MMMMCMXCIX")
	public void the_result_should_be_X(){
        assertEquals("MMMMCMXCIX", converter.convert(arabicNumber));
	}

}
