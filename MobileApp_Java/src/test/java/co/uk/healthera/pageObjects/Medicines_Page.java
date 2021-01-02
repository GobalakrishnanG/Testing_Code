package co.uk.healthera.pageObjects;

import co.uk.healthera.baseAppUtils.MobileAppUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Medicines_Page extends MobileAppUtils {

    public Medicines_Page() throws IOException, ParseException {
        super();
    }

    @iOSXCUITFindBy(accessibility = "Medicines")
    public MobileElement medicinesTab;

    @iOSXCUITFindBy(accessibility = "MedicineContainerViewController_uibarbuttonitem_addMedicineBarButton")
    public MobileElement addMedicine;

    public void medicinesTab() {
        getWait().waitForVisible(this.medicinesTab).click();
    }

    public void addMedicine() {
        addMedicine.click();
    }


}
