package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomeSteps;


public class HomeStepDefinitions {

    @Steps
    HomeSteps homeSteps;

    @Given("^Add the product of homePage to cart$")
    public void add_the_product_of_homePage_to_cart() {

        homeSteps.add_the_product_of_homePage_to_cart();
    }

    @Then("^Will be able to see the product on Cart$")
    public void will_be_able_to_see_the_product_on_Cart() {

        homeSteps.will_be_able_to_see_the_product_on_Cart();
    }

    @Given("^Access quick view of product on homePage$")
    public void access_quick_view_of_product_on_homePage() {

        homeSteps.access_quick_view_of_product_on_homePage();
    }

    @When("^Add the product on quick view$")
    public void add_the_product_on_quick_view() {

        homeSteps.add_the_product_on_quick_view();
    }


}
