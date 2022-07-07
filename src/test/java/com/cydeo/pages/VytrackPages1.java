package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackPages1 {

    public VytrackPages1(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "prependedInput")
    public WebElement userName;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement clickButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement VehiclesButton;

    @FindBy(xpath = "//a[@title='With this button you will export the content of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']")
    public WebElement ExportGridButton;

    @FindBy(xpath = "//a[@title='Reset']")
    public WebElement resetBtn;

    @FindBy(xpath = "//a[@title='Refresh']")
    public WebElement refreshBtn;

    @FindBy(xpath = "//i[@class='fa-chevron-right hide-text']")
    public WebElement nextBtn;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement pageNumber;

}
