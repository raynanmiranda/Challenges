package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.LoginPage;

import static junit.framework.TestCase.assertTrue;

public class LoginSteps {

    HomePage homePg;
    LoginPage loginPg;

    @Step("open WebSite")
    public void openWebSite(){
        loginPg.open();
    }


    @Step("Is on the Login Page$")
    public void is_on_the_login_page() {

        homePg.clickBtnSignIn();
    }

    @Step("I fill up the email '{0}' and I fill up the password '{0}'$")
    public void i_fill_up_the_user_and_i_fill_up_the_password(String email,String password) {

        loginPg.insertEmailField(email);
        loginPg.insertPasswordField(password);
    }

    @Step("Access the System")
    public void access_the_System() {

        loginPg.clickBtnSignIn();
    }

    @Step("The user will me authenticated with success")
    public void the_user_will_me_authenticated_with_success() {

       assertTrue("UserName is not the same logged!",loginPg.getUserNameAccount().equals("testr lastRtest"));
    }
}
