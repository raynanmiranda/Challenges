package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ContactUsSteps;

public class ContactUsStepDefinitions {

    @Steps
    ContactUsSteps contactUsSteps;

    @Given("^Is on Contact Us Page$")
    public void is_on_Contact_Us_Page() {

        contactUsSteps.is_on_Contact_Us_Page();
    }

    @When("^include the message$")
    public void include_the_message(DataTable dt) {

        contactUsSteps.include_the_message(dt);
    }

    @Then("^Will send the message with success$")
    public void will_send_the_message_with_success() {

        contactUsSteps.will_send_the_message_with_success();
    }
}
