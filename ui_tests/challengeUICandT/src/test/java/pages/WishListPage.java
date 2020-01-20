package pages;

import bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListPage extends PageBase {

    public WishListPage(WebDriver driver) {
        super(driver);
    }

    By btnWishLitView = By.xpath("//*[@id='wishlist_15693']//a[contains(text(),'View')]");
    private WebElement validatePresenceProductWishList(String productName){

        return driver.findElement(By.xpath("//*[@id='s_title'][contains(text(),'"+productName+"')]"));
    }

    By btnRemoveProductsWishList = By.xpath("//*[@class='wishlist_delete']/a");

    public void clickBtnWishLitView(){

        click(btnWishLitView);
    }

    public boolean getValidatePresenceProductWishList(String productName){

        try{
            return validatePresenceProductWishList(productName).isDisplayed();
        }
        catch(Exception e){
            return false;
        }
    }

    public void clickBtnRemoveProductsWishList(){

        click(btnRemoveProductsWishList);
    }
    public void confirmRemoveProductWishListPopUp(){

        try{
            Thread.sleep(500);
        }
        catch(Exception e){

        }
        driver.switchTo().alert().accept();
    }
}
