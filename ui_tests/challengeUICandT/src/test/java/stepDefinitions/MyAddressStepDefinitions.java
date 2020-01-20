package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MyAddressSteps;

public class MyAddressStepDefinitions {

    @Steps
    MyAddressSteps myAddressSteps;

    @And("^Have already sign in$")
    public void have_already_sign_in() {

        myAddressSteps.have_already_sign_in();
    }

    @And("^Is on My Address Page$")
    public void is_on_My_Address_Page() {

        myAddressSteps.is_on_My_Address_Page();
    }

    @When("^Fill up and save the new address$")
    public void fill_up_and_save_the_new_address() {

        myAddressSteps.fill_up_and_save_the_new_address();
    }

    @Then("^Will be present the new address add$")
    public void will_be_present_the_new_address_add() {

        myAddressSteps.will_be_present_the_new_address_add();
    }

    // ---------- Update Methods of MyAddress ----------------------

    @When("^Update the address$")
    public void update_the_address() {

        myAddressSteps.update_the_address();
    }

    @Then("^Will be present the new data on address$")
    public void will_be_present_the_new_data_on_address() {

        myAddressSteps.will_be_present_the_new_data_on_address();
    }
}

