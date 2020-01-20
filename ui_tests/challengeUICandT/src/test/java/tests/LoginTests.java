package tests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Login.feature",
                     glue = {"classpath:stepDefinitions","classpath:hooks"}
                     //tags = {"@updateAddress"}
                )

public class LoginTests {

}
