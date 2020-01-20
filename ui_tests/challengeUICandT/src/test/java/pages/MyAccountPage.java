package pages;

import bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends PageBase {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    By btnMyAddresses = By.xpath("//*[@id='center_column']//*[@title='Addresses']");
    By btnMyWishList = By.xpath("//*[@id='center_column']//*[@title='My wishlists']");

    public void clickBtnMyAddresses(){

        click(btnMyAddresses);
    }

    public void clickBtnMyWishList(){

        click(btnMyWishList);
    }
}
