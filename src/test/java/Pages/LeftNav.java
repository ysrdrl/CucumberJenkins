package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeftNav extends Parent{

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='States']")
    private WebElement states;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationality;

    @FindBy(xpath = "(//span[contains(text(),'Fees')])[1]")
    private WebElement fees;

    @FindBy(xpath = "fuse-nav-vertical-item[class^='ng-tns-c249-8']")
    private List<WebElement> parametersElement;

    @FindBy(xpath = "(//span[contains(text(),'Entrance Exams')])[1]")
    private WebElement entranceExams;

    @FindBy(xpath = "(//span[contains(text(),'Entrance Exams')])[2]")
    private WebElement entranceExams2;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setup1;

    @FindBy(xpath = "//span[contains(text(),'Human Resources')]")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[contains(text(),'Employees')])[1]")
    private WebElement employees;




    public LeftNav() {

        PageFactory.initElements(GWD.getDriver(),this);
    }
    private WebElement myElement;
    public void findAndClick(String strElement){
        switch (strElement){
            case "setup":
                myElement=setup;
                break;
            case "parameters":
                myElement=parameters;
                break;
            case "countries":
                myElement=countries;
                break;

            case "citizenShip":
                myElement=citizenShip;
                break;
            case "nationality":
                myElement=nationality;
                break;
            case "fees":
                myElement=fees;
                break;
            case "entranceExams":
                myElement=entranceExams;
                break;
            case "entranceExams2":
                myElement=entranceExams2;
                break;
            case "setup1":
                myElement=setup1;
                break;
            case "humanResources":
                myElement=humanResources;
                break;
            case "employees":
                myElement=employees;
                break;
            case "states":
                myElement=states;
                break;

        }
        clickFunction(myElement);
    }


}
