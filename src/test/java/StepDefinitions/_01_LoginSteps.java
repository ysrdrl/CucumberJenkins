package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class _01_LoginSteps {
    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    DialogContent dc = new DialogContent();

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.findAndSend("username", "turkeyts");
        dc.findAndSend("password", "TechnoStudy123");
        dc.findAndClick("loginButton");
    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {

        dc.findAndContainsText("dashBoard", "Dashboard");
    }
}
