package arabic.to.romain.number;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OnesNumbersSteps {


	@Given("I have supplied the arabic number (\\d+)$")
	public void the_menu_contains_the_following_dishes(final Integer quantity) {
		System.out.println("quantity::"+quantity);
	}

	@When("I ask for the roman numerals")
	public void the_customer_order() {
		// System.out.println("quantity::"+quantity);
	}

	@Then("the result should be I")
	public void the_result_should_be_I(){

	}

}
