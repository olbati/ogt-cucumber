package arabic.to.romain.number;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class TenStep {

    RomanNumeralConverter converter = new RomanNumeralConverter();
    Integer arabicNumber;
	@Given("I have supplied the ten arabic number (\\d+)$")
	public void the_menu_contains_the_following_dishes(final Integer arabicNumber) {
        this.arabicNumber=arabicNumber;
	}

	@When("I ask for the ten roman numerals")
	public void the_customer_order() {

	}

	@Then("the result should be X")
	public void the_result_should_be_X(){
        assertEquals("X", converter.convert(arabicNumber));
	}

}
