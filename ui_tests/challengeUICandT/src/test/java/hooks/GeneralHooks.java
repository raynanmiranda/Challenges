package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

public class GeneralHooks {

    @Steps
    LoginSteps loginSteps;
    @Before
    public void beforeScenario(){
        //código a ser executado antes de cada cenário
        loginSteps.openWebSite();
    }

    @After
    public void afterScenario(){
        //código a ser executado depois de cada cenário

    }

}
