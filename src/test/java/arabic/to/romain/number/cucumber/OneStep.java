package arabic.to.romain.number.cucumber;

import java.util.List;

import arabic.to.romain.number.RomanNumeralConverter;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class OneStep {

    RomanNumeralConverter converter = new RomanNumeralConverter();
    Integer oneArabicNumber;
	@Given("I have supplied the arabic number (\\d+)$")
	public void the_menu_contains_the_following_dishes(final Integer oneArabicNumber) {
        this.oneArabicNumber=oneArabicNumber;
	}

	@When("I ask for the roman numerals")
	public void the_customer_order() {

	}

	@Then("the result should be I")
	public void the_result_should_be_I(){
        assertEquals("I", converter.convert(oneArabicNumber));

	}

}
