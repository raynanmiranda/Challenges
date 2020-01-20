package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("^Is on the Login Page$")
    public void i_fill_up_the_user() {

        loginSteps.is_on_the_login_page();
    }

    @And("^fill up the email \"([^\"]*)\" and I fill up the password \"([^\"]*)\"$")
    public void i_fill_up_the_password(String email,String password) {

        loginSteps.i_fill_up_the_user_and_i_fill_up_the_password(email,password);
    }

    @When("^Access the System$")
    public void access_the_System() {

        loginSteps.access_the_System();
    }

    @Then("^The user will be authenticated with success$")
    public void the_user_will_me_authenticated_with_success() {

        loginSteps.the_user_will_me_authenticated_with_success();
    }


}
