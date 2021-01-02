package co.uk.healthera.pageObjects;

import co.uk.healthera.baseAppUtils.MobileAppUtils;
import co.uk.healthera.driver.Device;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Profile_Page extends MobileAppUtils {

    public Profile_Page() throws IOException, ParseException {
        super();
    }

    @iOSXCUITFindBy(accessibility = "Profile")
    public MobileElement profileTab;

    public void profileTab() {
        getWait().waitForVisible(this.profileTab).click();
    }

}
