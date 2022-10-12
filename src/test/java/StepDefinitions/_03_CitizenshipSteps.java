package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

public class _03_CitizenshipSteps {
    DialogContent dc=new DialogContent();
    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {
        LeftNav ln=new LeftNav();

        ln.findAndClick("setup");
        ln.findAndClick("parameters");
        ln.findAndClick("citizenShip");
    }
    @When("User a Citizenship name as {string} shortname as{string}")
    public void userACitizenshipNameAsShortnameAs(String name, String shortName) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndSend("shortName",shortName);
        dc.findAndClick("saveButton");

    }
    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.findAndContainsText("alreadyExist","already exists.");

    }
    @And("Click on cloe button")
    public void clickOnCloeButton() {

        dc.findAndClick("closeDialog");
    }

    @When("User delete the {string}")
    public void userDeleteThe(String name) {

        dc.searchAndDelete(name);

    }

}
