package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.findAndClick("setup");
        ln.findAndClick("parameters");
        //GWD.getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("fuse-nav-vertical-item[class^='ng-tns-c249-8']")));
        ln.findAndClick("countries");
    }
    @When("Create a country")
    public void createACountry() {

        String randomGenName= RandomStringUtils.randomAlphabetic(8);
        String randomGenCode= RandomStringUtils.randomAlphabetic(4);

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","Trabzon");
        dc.findAndSend("countryCode","61");
        dc.findAndClick("saveButton");


    }
    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("createdSuccess","success");

    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String cityName, String cityCode) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",cityName);
        dc.findAndSend("countryCode",cityCode);
        dc.findAndClick("saveButton");

    }


    @And("User delete the collective")
    public void userDeleteTheCollective() {

        dc.searchAndDelete("Trabzon");

    }
}
