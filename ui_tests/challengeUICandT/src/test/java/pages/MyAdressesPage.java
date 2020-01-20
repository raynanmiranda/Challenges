package pages;

import bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class MyAdressesPage extends PageBase {

    public MyAdressesPage(WebDriver driver) {
        super(driver);
    }

    By btnAddNewAddress = By.xpath("//*[@id='center_column']//*[@title='Add an address']");
    By addressNameField = By.id("address1");
    By cityField = By.id("city");
    By stateField = By.xpath("//*[@id='id_state']");
    By zipPostCodeField = By.id("postcode");
    By countryField = By.id("id_country");
    By homePhoneField = By.id("phone");
    By addressAssignField = By.id("alias");
    By btnSubmitAddress = By.id("submitAddress");

    private WebElement validateAddressCreated (String addressName) {

        return driver.findElement(By.xpath("//*[@id='center_column']//*[@class='bloc_adresses row']//h3[text()='"+addressName+"']"));
    }
    private WebElement btnUpdateAddress (String addressName) {

        return driver.findElement(By.xpath("//*[@id='center_column']//*[@class='bloc_adresses row']//h3[text()='"+addressName
                +"']/parent::li//following-sibling::li//a[@title='Update']"));
    }
    private WebElement checkDataUpdated (String addressName,String dataUpdated) {

        return driver.findElement(By.xpath("//*[@id='center_column']//*[@class='bloc_adresses row']//h3[text()='"+addressName
                +"']/parent::li//following-sibling::li/span[contains(text(),'"+dataUpdated+"')]"));
    }

    protected String postCodeRandom = "";

    public void clickBtnAddNewAddress(){

        click(btnAddNewAddress);
    }

    public void insertAddressNameField(String addressName){

        clearAndSendKeys(addressNameField,addressName);
    }

    public void insertCityField(String city){

        clearAndSendKeys(cityField,city);
    }

    public void selectStateField(String state){

        comboBoxSelectByValue(stateField,state);
    }
    public void insertZipPostCodeField(){


        Random rd = new Random();
        for(int i = 1 ; i <=5 ; i++){
            int rdNumberDoc = rd.nextInt(10);
            postCodeRandom += Integer.toString(rdNumberDoc);
        }
        clearAndSendKeys(zipPostCodeField,postCodeRandom);
    }
    public void selectCountryField(String country){

        comboBoxSelectByValue(countryField,country);
    }

    public void insertHomePhoneField(String phone){

        clearAndSendKeys(homePhoneField,phone);
    }

    public void insertAddressAssignField(String assignAddress){

        clearAndSendKeys(addressAssignField,assignAddress);
    }

    public void clickBtnSubmitAddress(){

        click(btnSubmitAddress);
    }

    public Boolean getValidateAddressCreated(String addressName){

      return validateAddressCreated(addressName).isDisplayed();
    }

    public void clickBtnUpdateAddress(String addressSign){

        btnUpdateAddress(addressSign).click();
    }

    public boolean checkAddressDataUpdated(String addressSign,String dataAddress){

        return checkDataUpdated(addressSign,dataAddress).isDisplayed();
    }

    public String getPostCodeRandom(){

        return postCodeRandom;
    }
}
