package pages;

import bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Mapping
    By btnSignIn = By.xpath("//*[@id='header']//*[@class='login']");
    By btnHomePage = By.xpath("//*[@class='logo img-responsive']");
    By btnManageAccount = By.xpath("//*[@class='account']");
    By btnContactUs = By.xpath("//*[@id='contact-link']/a");

    private WebElement btnAddProduct(String productName){

        return driver.findElement(By.xpath("//*[@id='homefeatured']//li//div/a[@title='"+productName
                +"']/parent::div/parent::div/following-sibling::div/div/a[@class='button ajax_add_to_cart_button btn btn-default']"));
    }

    By verifyMgsAddCartSuccessfuly = By.xpath("//*[@id='layer_cart']//*[@class='layer_cart_product col-xs-12 col-md-6']/h2");
    By btnProceedCheckout = By.xpath("//*[@id='layer_cart']//*[@class='button-container']/a");

    private WebElement validateProductCart(String productName){

        return driver.findElement(By.xpath("//*[@id='cart_summary']//*[@class='product-name']/a[contains(text(),'"+productName+"')]"));
    }

    private WebElement btnQuickViewProduct(String productName){

        return driver.findElement(By.xpath("//*[@id='homefeatured']//li//div/a[@title='"+productName
                +"']/parent::div/parent::div//a[@class='quick-view']"));
    }

    By btnAddProductOnCartQuickView = By.xpath("//*[@id='add_to_cart']/button");

    private WebElement btnMore(String productName){

        return driver.findElement(By.xpath("//*[@id='homefeatured']//li//div/a[@title='"+productName
                +"']/parent::div/parent::div/following-sibling::div/div/a[@class='button lnk_view btn btn-default']"));
    }


    public void clickBtnSignIn(){

        click(btnSignIn);
    }

    public void clickBtnHomePage(){

        click(btnHomePage);
    }

    public void clickBtnAddProduct(String ProductName){

        javaScriptExecutor.executeScript("arguments[0].scrollIntoView(true);", btnAddProduct(ProductName));
        javaScriptExecutor.executeScript("arguments[0].click();", btnAddProduct(ProductName));
    }

    public String getMgsAddCartSuccessfuly(){

        return getText(verifyMgsAddCartSuccessfuly);
    }

    public void clickBtnProceedCheckout(){

        click(btnProceedCheckout);
    }

    public boolean getValidateProductCart(String productName){

        return validateProductCart(productName).isDisplayed();
    }

    public void clickBtnQuickViewProduct(String ProductName){

        javaScriptExecutor.executeScript("arguments[0].scrollIntoView(true);", btnQuickViewProduct(ProductName));
        javaScriptExecutor.executeScript("arguments[0].click();", btnQuickViewProduct(ProductName));

    }

    public void clickBtnAddProductOnCartQuickView(){

        click(btnAddProductOnCartQuickView);
    }

    public void clickBtnMore(String ProductName){

        javaScriptExecutor.executeScript("arguments[0].scrollIntoView(true);", btnMore(ProductName));
        javaScriptExecutor.executeScript("arguments[0].click();", btnMore(ProductName));
    }

    public void clickBtnManageAccount(){

        click(btnManageAccount);
    }

    public void clickBtnContactUs(){

        click(btnContactUs);
    }
}
