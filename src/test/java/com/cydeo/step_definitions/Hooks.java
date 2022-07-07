package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //@Before is coming from cucumber. It is running before each scenario
    @Before
    public void setupScenario(){
        System.out.println("--> It is coming from @Before in Hooks");
    }

    //@After is coming from cucumber. It is running after each scenario
    @After
    public void tearDownScenario(Scenario scenario){
        System.out.println("-->It is coming from @After in Hooks");

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }

}
