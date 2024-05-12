package stepsDefinitions.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static drivers.DriverFactory.cleanupDriver;
import static drivers.DriverFactory.getDriver;

public class Hooks {

    @Before
    public void setup() {
        getDriver();
    }

    @After
    public void tearDown() {
        cleanupDriver();
    }

}
