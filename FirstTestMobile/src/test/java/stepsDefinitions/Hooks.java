package stepsDefinitions;

import core.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static core.DriverFactory.getDRIVER;

public class Hooks extends DriverFactory {

    @Before
    public void inicializaAppium() {
        DriverFactory.createDriver();
    }

    @After
    public void turnOffDriver() {
        getDRIVER().quit();
    }

}