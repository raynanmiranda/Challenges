package pages;

import bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends PageBase {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    By subjectHeadingDropDown = By.id("//*[@id='id_contact']");
    By emailAddressField = By.id("//*[@id='email']");
    By orderReferenceField = By.id("//*[@id='id_order']");
    By messageField = By.id("//*[@id='message']");
    By btnSubmitField = By.id("//*[@id='submitMessage']");
    By validateSendMessageSucces = By.xpath("//*[@class='alert alert-success']");

    public void selectSubjectHeadingDropDown(String subject){

        comboBoxSelectByValue(subjectHeadingDropDown,subject);
    }

    public void insertEmailAddressField(String email){

        clearAndSendKeys(emailAddressField,email);
    }

    public void insertOrderReferenceField(String order){

        clearAndSendKeys(orderReferenceField,order);
    }

    public void insertMessageField(String message){

        clearAndSendKeys(messageField,message);
    }

    public void clickBtnSubmitField(){

        click(btnSubmitField);
    }

    public String getValidateSendMessageSucces(){

        return getText(validateSendMessageSucces);
    }

}
