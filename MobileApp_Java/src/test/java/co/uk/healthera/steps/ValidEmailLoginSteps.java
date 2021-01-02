package co.uk.healthera.steps;

import co.uk.healthera.driver.Device;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import co.uk.healthera.baseAppPage.MobileAppPages;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ValidEmailLoginSteps extends MobileAppPages {

    public ValidEmailLoginSteps() throws IOException, ParseException {
        super();
    }

    @Given("user taps on 'Continue with email' button")
    public void userTappedOnExistingUerLogin() throws MalformedURLException {
        getLoginPage().continueWithEmail();
    }

    @When("enters {string} and taps 'Continue' button, enters {string} and taps 'Login' button")
    public void userEnterEmailandPassword(String email, String password) {
        getLoginPage().emailLogin(email, password);

    }



}
