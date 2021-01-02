package co.uk.healthera.steps;

import co.uk.healthera.driver.Device;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import co.uk.healthera.baseAppPage.MobileAppPages;

import java.io.IOException;
import java.net.MalformedURLException;

public class AddMedicineSteps extends MobileAppPages {

    public AddMedicineSteps() throws IOException, ParseException {
        super();
    }

    @When("user taps on 'Medicines' nav tab")
    public void userTapsOnMedicinesNavTab() throws MalformedURLException {
        getMedicinesPage().medicinesTab();
    }

    @When("tap on 'Add Medicine' text on the 'Medicines' page")
    public void userTapOnAddMedicinesText() {
        getMedicinesPage().addMedicine();
    }

}
