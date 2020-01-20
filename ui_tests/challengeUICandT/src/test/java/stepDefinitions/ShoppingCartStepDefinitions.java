package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ShoppingCartSteps;


public class ShoppingCartStepDefinitions {

    @Steps
    ShoppingCartSteps shopCartSteps;

    @And("^Have a product on cart$")
    public void have_a_product_on_cart() {

        shopCartSteps.have_a_product_on_cart();
    }


    @When("^Finish the proccess of payment$")
    public void finish_the_proccess_of_payment() {

        shopCartSteps.finish_the_proccess_of_payment();
    }

    @Then("^Will buy the product with success$")
    public void will_buy_the_product_with_success() {

        shopCartSteps.will_buy_the_product_with_success();
    }


}
