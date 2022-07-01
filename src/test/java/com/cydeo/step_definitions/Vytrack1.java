package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackPages1;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Vytrack1 {
    @Given("user is on the log in page")
    public void user_is_on_the_log_in_page() {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");

    }
    @When("user log in with valid user name and password")
    public void user_log_in_with_valid_user_name_and_password() {
        VytrackPages1 vytrackPages1 = new VytrackPages1();
        vytrackPages1.userName.sendKeys("user37");
        vytrackPages1.password.sendKeys("UserUser123");
        vytrackPages1.clickButton.click();

    }
    @When("user is on the home page")
    public void user_is_on_the_home_page() {
        String title = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";
        Assert.assertEquals(title, expectedTitle);

    }
    @When("user clicks on the Fleet tap")
    public void user_clicks_on_the_fleet_tap() {


    }
    @When("user selects Vehicle dropdown button")
    public void user_selects_vehicle_dropdown_button() {

    }
    @When("user is on the Car Homepage")
    public void user_is_on_the_car_homepage() {

    }
    @Then("user clicks Export Grid dropdown")
    public void user_clicks_export_grid_dropdown() {

    }

}
