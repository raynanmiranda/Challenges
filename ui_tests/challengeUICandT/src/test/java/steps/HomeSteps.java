package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

import static junit.framework.TestCase.assertTrue;

public class HomeSteps {

    HomePage homePg;

    private String product = "";

    @Step("Add the product of homePage to cart")
    public void add_the_product_of_homePage_to_cart() {

        product = "Faded Short Sleeve T-shirts";
        homePg.clickBtnAddProduct(product);
        assertTrue("Product was not added on cart!",
                homePg.getMgsAddCartSuccessfuly().equalsIgnoreCase("Product successfully added to your shopping cart"));
    }

    @Step("Will be able to see the product on Cart")
    public void will_be_able_to_see_the_product_on_Cart() {

        homePg.clickBtnProceedCheckout();
        assertTrue("Product not found on cart!",homePg.getValidateProductCart(product));
    }

    @Step("Access quick view of product on homePage")
    public void access_quick_view_of_product_on_homePage() {

        product = "Faded Short Sleeve T-shirts";
        homePg.clickBtnQuickViewProduct(product);
    }

    @Step("Add the product on quick view")
    public void add_the_product_on_quick_view() {

        homePg.clickBtnAddProductOnCartQuickView();
        assertTrue("Product was not added on cart!",
                homePg.getMgsAddCartSuccessfuly().equalsIgnoreCase("Product successfully added to your shopping cart"));
    }

}
