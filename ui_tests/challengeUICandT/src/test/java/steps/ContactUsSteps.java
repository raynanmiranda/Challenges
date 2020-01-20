package steps;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import pages.ContactUsPage;
import pages.HomePage;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class ContactUsSteps {

    HomePage homePg;
    ContactUsPage contactUsPg;

    @Step("Is on Contact Us Page")
    public void is_on_Contact_Us_Page() {

        homePg.clickBtnContactUs();
    }

    @Step("include the message")
    public void include_the_message(DataTable dt) {

        List<List<String>> list = dt.asLists(String.class);
        for (int i = 1; i < list.size(); i++) {

            contactUsPg.selectSubjectHeadingDropDown(list.get(i).get(0));
            contactUsPg.insertEmailAddressField(list.get(i).get(1));
            contactUsPg.insertOrderReferenceField(list.get(i).get(2));
            contactUsPg.insertMessageField(list.get(i).get(3));
            contactUsPg.clickBtnSubmitField();
        }
    }

    @Step("Will send the message with success")
    public void will_send_the_message_with_success() {

        assertTrue("Message was not Sent.",
                contactUsPg.getValidateSendMessageSucces().
                        equalsIgnoreCase("Your message has been successfully sent to our team."));
        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
    }
}
