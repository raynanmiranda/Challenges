package pages;

import bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends PageBase {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    By btnWriteReview = By.xpath("//*[@id='product_comments_block_extra']//*[@class='open-comment-form']");
    By titleField = By.id("comment_title");
    By commentField = By.id("content");
    By btnSubmitReview = By.id("submitNewMessage");

    private WebElement starQualityCheck(String stars){

        return driver.findElement(By.xpath("//*[@class='star_content']//div//a[@title='"+stars+"']"));
    }

    By validateMgdReviewAddedSuccess = By.xpath("//*[@id='product']//*[@class='fancybox-inner']/p[1]");
    By btnOkValidateMgdReviewAddedSuccess = By.xpath("//*[@id='product']//*[@class='fancybox-inner']/p[2]");
    By btnAddProductWishList = By.id("wishlist_button");
    By validateMgsProductAddWishList = By.xpath("//*[@id='product']//*[@class='fancybox-inner']/p");
    By btnCloseMgsProductAddWishList = By.xpath("//*[@title='Close']");

    public void clickBtnWriteReview(){

        click(btnWriteReview);
    }

    public void insertTitleField(String title){

        clearAndSendKeys(titleField,title);
    }

    public void insertCommentField(String comment){

        clearAndSendKeys(commentField,comment);
    }

    public void clickBtnSubmitReview(){

        click(btnSubmitReview);
    }

    public void setStarQualityChe(String stars){

        starQualityCheck(stars).click();
    }

    public String getValidateMgdReviewAddedSuccess(){

        return getText(validateMgdReviewAddedSuccess);
    }
    public void clickBtnOkValidateMgdReviewAddedSuccess(){

        click(btnOkValidateMgdReviewAddedSuccess);
    }

    public void clickBtnAddProductWishList(){

        click(btnAddProductWishList);
    }

    public String getValidateMgsProductAddWishList(){

        String test = getText(validateMgsProductAddWishList);
        return getText(validateMgsProductAddWishList);
    }

    public void clickBtnCloseMgsProductAddWishList(){

        click(btnCloseMgsProductAddWishList);
    }
}
