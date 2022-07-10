package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackPages1;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Vytrack1 {
    VytrackPages1 vytrackPages1 = new VytrackPages1();
    @Given("user is on the log in page")
    public void user_is_on_the_log_in_page() {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");

    }
    @When("user log in with valid user name and password")
    public void user_log_in_with_valid_user_name_and_password() {

        vytrackPages1.userName.sendKeys("user37");
        vytrackPages1.password.sendKeys("UserUser123");
        vytrackPages1.clickButton.click();

    }
    @When("user is on the home page")
    public void user_is_on_the_home_page() throws InterruptedException {
        Thread.sleep(3000);
        String title = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(expectedTitle,title);

    }
    @When("user clicks on the Fleet tap")
    public void user_clicks_on_the_fleet_tap() {
        //vytrackPages1.fleetButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vytrackPages1.fleetButton).perform();

    }
    @When("user selects Vehicle dropdown button")
    public void user_selects_vehicle_dropdown_button() {
        vytrackPages1.VehiclesButton.click();

    }
    @When("user is on the Car Homepage")
    public void user_is_on_the_car_homepage() throws InterruptedException {
        Thread.sleep(3000);
        String actual = Driver.getDriver().getTitle();
        String expected = "Car";

        Assert.assertTrue(actual.contains(expected));
        //System.out.println("actual = " + actual);

    }
    @Then("user clicks Export Grid dropdown")
    public void user_clicks_export_grid_dropdown() {
        System.out.println("vytrackPages1.ExportGridButton.isDisplayed() = " + vytrackPages1.ExportGridButton.isDisplayed());
    }

    @Then("user should see Export Grid dropdown is on the left of the page")
    public void userShouldSeeExportGridDropdownIsOnTheLeftOfThePage() {
        System.out.println("vytrackPages1.ExportGridButton.isEnabled() = " + vytrackPages1.ExportGridButton.isEnabled());
    }

    @And("User should be able to click refresh button")
    public void userShouldBeAbleToClickRefreshButton() {
        System.out.println("vytrackPages1.refreshBtn.isEnabled() = " + vytrackPages1.refreshBtn.isEnabled());
        String beforeRefresh = Driver.getDriver().getCurrentUrl();
        vytrackPages1.refreshBtn.click();
        String AfterRefresh = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(AfterRefresh, beforeRefresh);

    }

    @Then("User should be able click reset button")
    public void userShouldBeAbleClickResetButton() throws InterruptedException {
        System.out.println("vytrackPages1.resetBtn.isEnabled() = " + vytrackPages1.resetBtn.isEnabled());

//        Thread.sleep(2000);
        vytrackPages1.nextBtn.click();
//        Thread.sleep(2000);
        System.out.println("vytrackPages1.pageNumber.getAttribute(\"value\") = " + vytrackPages1.pageNumber.getAttribute("value"));
//        Thread.sleep(2000);
        vytrackPages1.resetBtn.click();
        Thread.sleep(2000);
        String actualPageNum = vytrackPages1.pageNumber.getAttribute("value");
//        Thread.sleep(2000);
        Assert.assertEquals("1", actualPageNum );

    }

    @Then("User should be able to click Grid Settings button")
    public void userShouldBeAbleToClickGridSettingsButton() {
        System.out.println("vytrackPages1.GridSettingsBtn.isDisplayed() = " + vytrackPages1.GridSettingsBtn.isDisplayed());
    }

    @Then("user should see Refresh button on the left side of Reset button")
    public void userShouldSeeRefreshButtonOnTheLeftSideOfResetButton() {
        //System.out.println("vytrackPages1.refreshBtn.getLocation() = " + vytrackPages1.refreshBtn.getLocation());
        System.out.println("vytrackPages1.ifButtonOnTheLeft(\"Refresh\", \"Reset\") = " + vytrackPages1.ifButtonOnTheLeft("Refresh", "Reset"));
    }
}
