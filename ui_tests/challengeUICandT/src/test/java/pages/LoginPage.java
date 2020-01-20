package pages;

import bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By emailField = By.id("email");
    By passwordField = By.id("passwd");
    By btnSignIn = By.id("SubmitLogin");
    By validateUserNameAccountView = By.xpath("//*[@id='header']//*[@class='account']/span");

    // Insert the email address on the account field
    public void insertEmailField(String email){

        clearAndSendKeys(emailField,email);
    }

    // Insert password on the account field
    public void insertPasswordField(String password){

        clearAndSendKeys(passwordField,password);
    }

    // Click to sign In the account
    public void clickBtnSignIn(){

        click(btnSignIn);
    }

    public String getUserNameAccount(){

        return getText(validateUserNameAccountView);
    }
}
