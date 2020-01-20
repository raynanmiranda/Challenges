package tests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Shopping.feature",
        glue = {"classpath:stepDefinitions","classpath:hooks"}
        //tags = {"@BuyProductWithSuccess"}
)
public class ShoppingTests {
}
