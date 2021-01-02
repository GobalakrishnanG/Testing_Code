package co.uk.healthera.baseAppPage;

import co.uk.healthera.pageObjects.*;
import org.json.simple.parser.ParseException;
import java.io.IOException;

public class MobileAppPages {

    private Home_Page homePage;
    private Login_Page loginPage;
    private Medicines_Page medicinesPage;
    private Orders_Page ordersPage;
    private Pharmacy_Page pharmacyPage;
    private Profile_Page profilePage;
    private YourDetails_Page yourDetailsPage;

    public MobileAppPages() throws IOException, ParseException {
        this.homePage = homePage;
        this.loginPage = new Login_Page();
        this.medicinesPage = new Medicines_Page();
        this.ordersPage = ordersPage;
        this.pharmacyPage = pharmacyPage;
        this.profilePage = new Profile_Page();
        this.yourDetailsPage = yourDetailsPage;
    }

    public Home_Page getHomePage() {
        return homePage;
    }

    public Login_Page getLoginPage() {
        return loginPage;
    }

    public Medicines_Page getMedicinesPage() {
        return medicinesPage;
    }

    public Orders_Page getOrdersPage() {
        return ordersPage;
    }

    public Pharmacy_Page getPharmacyPage() {
        return pharmacyPage;
    }

    public Profile_Page getProfilePage() {
        return profilePage;
    }

    public YourDetails_Page getYourDetailsPage() {
        return yourDetailsPage;
    }

}
