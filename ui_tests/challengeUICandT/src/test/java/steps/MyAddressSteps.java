package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.MyAdressesPage;

import static junit.framework.TestCase.assertTrue;

public class MyAddressSteps {

    LoginPage loginPg;
    MyAccountPage myAccountPg;
    MyAdressesPage myAddressPg;

    private String email = "testRCreated@test.com";
    private String password = "442200";
    private String address = "New Address Test";
    private String addressSign = "";
    private String city = "bh";
    private String homePhone = "99082353";

    @Step("Have already sign in")
    public void have_already_sign_in() {

        loginPg.insertEmailField(email);
        loginPg.insertPasswordField(password);
        loginPg.clickBtnSignIn();
    }

    @Step("Is on My Address Page")
    public void is_on_My_Address_Page() {

        myAccountPg.clickBtnMyAddresses();
    }

    @Step("Fill up and save the new address")
    public void fill_up_and_save_the_new_address() {

        addressSign = "New Assign Address";

        myAddressPg.clickBtnAddNewAddress();
        myAddressPg.insertAddressNameField(address);
        myAddressPg.insertCityField(city);
        myAddressPg.selectStateField("35");
        myAddressPg.insertZipPostCodeField();
        myAddressPg.selectCountryField("21");
        myAddressPg.insertHomePhoneField(homePhone);
        myAddressPg.insertAddressAssignField(addressSign);
        myAddressPg.clickBtnSubmitAddress();
    }

    @Step("Will be present the new address add")
    public void will_be_present_the_new_address_add() {

        assertTrue("Address added was not found!",myAddressPg.getValidateAddressCreated(addressSign));
    }

    // ---------- Update Methods of MyAddress ----------------------

    @Step("Update the address")
    public void update_the_address() {

        addressSign = "My address";
        myAddressPg.clickBtnUpdateAddress(addressSign);
        myAddressPg.insertZipPostCodeField();
        myAddressPg.clickBtnSubmitAddress();
    }

    @Step("Will be present the new data on address")
    public void will_be_present_the_new_data_on_address() {

        assertTrue("",myAddressPg.checkAddressDataUpdated(addressSign,myAddressPg.getPostCodeRandom()));
    }
}
