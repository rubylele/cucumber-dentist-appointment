package uni.fmi.reserve;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.reserve.model.ReserveScreenModel;

public class ReserveSteps {
	
	private ReserveScreenModel reserveModel;

	@Given("^Open window for reserving time$")
	public void open_window_for_reserving_time() throws Throwable {
	    reserveModel = new ReserveScreenModel();
	}

	@When("^Enter valid user email$")
	public void enter_valid_user_email() throws Throwable {
		reserveModel.setEmail("Dmitry");
	}
	@When("^Enter invalid user email$")
	public void enter_invalid_user_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		reserveModel.setEmail("inval");
	}
	@When("^Enter valid time$")
	public void enter_valid_time() throws Throwable {
		reserveModel.setTime("2022/27/04");

	}
	@When("^click reserve button$")
	public void click_reserve_button() throws Throwable {
		reserveModel.click_reserve_button();
	}
	
	@Then("^see message success$")
	public void see_message_success() throws Throwable {
		assertEquals("Reserve is accepted", reserveModel.getMessage() );
	}

	@Then("^see message missing some field$")
	public void see_message_missing_some_field() throws Throwable {
		assertEquals("Enter email and time", reserveModel.getMessage() );
	}
	@Then("^see message invalid email$")
	public void see_message_invalid_email() throws Throwable {
		assertEquals("Invalid email", reserveModel.getMessage() );
	}

}
