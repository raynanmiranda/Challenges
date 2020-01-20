package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.ShoppingCartPage;

import static junit.framework.TestCase.assertTrue;

public class ShoppingCartSteps {

    HomePage homePg;
    ShoppingCartPage shopCartPg;

    private String product = "";

    @Step("Have a product on cart")
    public void have_a_product_on_cart() {

        product = "Printed Dress";
        homePg.clickBtnHomePage();
        homePg.clickBtnAddProduct(product);
        assertTrue("Product was not added on cart!",
                homePg.getMgsAddCartSuccessfuly().equalsIgnoreCase("Product successfully added to your shopping cart"));
    }


    @Step("Finish the proccess of payment")
    public void finish_the_proccess_of_payment() {

        homePg.clickBtnProceedCheckout();
        shopCartPg.clickBtnCheckOutCartProccess();
        shopCartPg.clickBtnSubmitAddressCartProccess();
        shopCartPg.selectAgreeTermCheckBox();
        shopCartPg.clickBtnSubmitShippingCartProccess();
        shopCartPg.clickBtnPayBankWire();
        shopCartPg.clickBtnConfirmOrder();
    }

    @Step("Will buy the product with success")
    public void will_buy_the_product_with_success() {

        assertTrue("The Order was not completed, please verify!",
                shopCartPg.getMgsValidateMgsOrderSuccess().equalsIgnoreCase("Your order on My Store is complete."));
    }
}
