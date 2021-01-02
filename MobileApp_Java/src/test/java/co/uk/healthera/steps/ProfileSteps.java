package co.uk.healthera.steps;

import co.uk.healthera.baseAppPage.MobileAppPages;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.MalformedURLException;

public class ProfileSteps extends MobileAppPages {

    public ProfileSteps() throws IOException, ParseException {
        super();
    }

    @When("user taps on 'Profile' nav tab")
    public void userTapsOnProfileNavTab() throws MalformedURLException, InterruptedException {
        getProfilePage().profileTab();
    }

}
