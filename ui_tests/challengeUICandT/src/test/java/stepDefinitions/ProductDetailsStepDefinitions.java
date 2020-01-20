package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ProductDetailsSteps;

public class ProductDetailsStepDefinitions {

    @Steps
    ProductDetailsSteps productDSteps;

    @Given("^Is on product Details$")
    public void is_on_product_Details() {

        productDSteps.is_on_product_Details();
    }

    @When("^Add the review on product$")
    public void add_the_review_on_product() {

        productDSteps.add_the_review_on_product();
    }

    @Then("^Will be able to see the review on product$")
    public void will_be_able_to_see_the_review_on_product() {

        productDSteps.will_be_able_to_see_the_review_on_product();
    }

    @When("^Add the product to wish List$")
    public void add_the_product_to_wish_List() {

        productDSteps.add_the_product_to_wish_List();
    }

    @Then("^Will be able to see the product wishList$")
    public void will_be_able_to_see_the_product_wishList() {

        productDSteps.will_be_able_to_see_the_product_wishList();
    }

    @Given("^have already a product on wishList$")
    public void have_already_a_product_on_wishList() {

        productDSteps.have_already_a_product_on_wishList();
    }

    @When("^Remove the product$")
    public void remove_the_product() {

        productDSteps.remove_the_product();
    }

    @Then("^Will Remove the product on wishList successfuly$")
    public void will_Remove_the_product_on_wishList_successfuly() {

        productDSteps.will_Remove_the_product_on_wishList_successfuly();
    }
}
