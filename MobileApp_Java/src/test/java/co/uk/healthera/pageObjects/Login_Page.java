package co.uk.healthera.pageObjects;

import co.uk.healthera.driver.Device;
import co.uk.healthera.baseAppUtils.MobileAppUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Login_Page extends MobileAppUtils {

    public Login_Page() throws IOException, ParseException {
        super();
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
    public MobileElement popUpAllow;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Continue with email\"]")
    public MobileElement continueWithEmailButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField\n[@value=\"E-mail address\"]")
    public MobileElement loginEmailAddress;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Continue\"]")
    public MobileElement continueLoginButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value=\"Password\"]")
    public MobileElement loginPassWord;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Login\"]")
    public MobileElement loginButton;

    @iOSXCUITFindBy(accessibility = "Healthera logo")
    public MobileElement healtheraLogo;


    public void continueWithEmail() {
        this.popUpAllow.click();
        this.continueWithEmailButton.click();
    }

    public void emailLogin(String emailID, String password) {
        this.loginEmailAddress.sendKeys(emailID);
        Device.driver.hideKeyboard();
        getWait().waitForVisible(this.loginPassWord).sendKeys(password);
        Device.driver.hideKeyboard();
        this.loginButton.click();
    }

}
