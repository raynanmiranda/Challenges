package pages;

import bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends PageBase {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    By btnCheckOutProccess = By.xpath("//*[@class='cart_navigation clearfix']//*[@title='Proceed to checkout']");
    By btnSubmitAddressCartProccess = By.xpath("//*[@id='center_column']//*[@type='submit']");
    By agreeTermCheckBox = By.xpath("//*[@id='uniform-cgv']/span");
    By btnSubmitShippingCartProccess = By.xpath("//*[@id='form']//*[@type='submit']");
    By btnPayBankWire = By.xpath("//*[@id='HOOK_PAYMENT']//*[@title='Pay by bank wire']");
    By btnConfirmOrder = By.xpath("//*[@id='cart_navigation']/button");
    By validateMgsOrderSuccess = By.xpath("//*[@id='center_column']//*[@class='cheque-indent']/strong");

    public void clickBtnCheckOutCartProccess(){

        click(btnCheckOutProccess);
    }

    public void clickBtnSubmitAddressCartProccess(){

        click(btnSubmitAddressCartProccess);
    }

    public void selectAgreeTermCheckBox(){

        mouseOver(agreeTermCheckBox);
        click(agreeTermCheckBox);

    }

    public void clickBtnSubmitShippingCartProccess(){

        click(btnSubmitShippingCartProccess);
    }

    public void clickBtnPayBankWire(){

        click(btnPayBankWire);
    }

    public void clickBtnConfirmOrder(){

        click(btnConfirmOrder);
    }

    public String getMgsValidateMgsOrderSuccess(){

        return getText(validateMgsOrderSuccess);
    }
}
