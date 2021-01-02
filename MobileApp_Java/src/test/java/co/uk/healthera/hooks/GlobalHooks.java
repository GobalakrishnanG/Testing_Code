package co.uk.healthera.hooks;

import co.uk.healthera.driver.Device;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class GlobalHooks {

    private final Device device;

    public GlobalHooks() {
        this.device = new Device();
    }

    @Before
    public void before() throws MalformedURLException {
        device.getDriver();
    }

    @After
    public void after() {
        device.appQuit();
    }

}
