import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterOutlineStep {

    RomanNumeralConverter converter = new RomanNumeralConverter();
    Integer arabicNumber;
	@Given("the arabic number (\\d+)$")
	public void the_menu_contains_the_following_dishes(final Integer oneArabicNumber) {
        this.arabicNumber=oneArabicNumber;
	}

	@When("I ask for the romans numerals")
	public void the_customer_order() {

	}

	@Then("the roman rumber should be (.*)")
	public void the_result_should_be(String romainNumber){
        assertEquals(romainNumber, converter.convert(arabicNumber));

	}

}
