package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends Parent {

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(xpath = "(//button[contains(text(),'Accept all cookies')])[1]")
    private WebElement cookies;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[1]")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashBoard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//input[@aria-required='true']")
    private WebElement nameInput;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.CODE']/input)[2]")
    private WebElement countryCode;

    @FindBy(css = "ms-save-button button")
    private WebElement saveButton;


    @FindBy(xpath = "//div[contains(text(),'success')]")
    private WebElement createdSuccess;

    @FindBy(xpath = "(//input[contains(@id,'ms-text-field')])[4]")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists.')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[contains(@aria-label,'Close')]/span[@class='mat-button-wrapper']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchBox;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement searchButton;

    @FindBy(xpath = "(//span[contains(@class,'mat-button-wrapper')]//fa-icon)[4]")
    private WebElement entranceBack;

    @FindBy(css = "ms-delete-button[table='true']>button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),' Delete ')]")
    private WebElement deleteButton1;

    @FindBy(xpath = "//td[contains(@class,'mat-column-name')]")
    public List<WebElement> names;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.INTEGRATION_CODE']/input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@placeholder='GENERAL.FIELD.PRIORITY']/input")
    private WebElement priority;


    @FindBy(xpath = "(//input[@aria-required='true'])[1]")
    private WebElement emplooyeFirstName;

    @FindBy(xpath = "(//input[@aria-required='true'])[2]")
    private WebElement emplooyeLastName;

    @FindBy(xpath = "(//input[@aria-required='true'])[3]")
    private WebElement emplooyeId;

    @FindBy(xpath = "(//div[contains(@class,'mat-select-trigger ng-tns-c93')])[6]")
    private WebElement documentType;

    @FindBy(xpath = "//span[contains(text(),' Personal ID ')]")
    private WebElement personelId;

    @FindBy(css = "[formcontrolname='documentNumber']")
    private WebElement documentNumber;

    @FindBy(css = "[formcontrolname='country']")
    private WebElement emplooyeCountry;

    @FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
    private WebElement emplooyeContact;

    @FindBy(xpath = "(//span[contains(@class,'mat-option-text')]//span)[1]")
    private WebElement cityOne;





    public DialogContent() {

        PageFactory.initElements(GWD.getDriver(),this);
    }

    private WebElement myElement;
    public void findAndSend(String strElement,String value){
        switch (strElement){
            case "username":
                myElement=username;
                break;

            case "password":
                myElement = password;
                break;
            case "nameInput":
                myElement=nameInput;
                break;

            case "countryCode":
                myElement = countryCode;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "searchBox":
                myElement = searchBox;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;
            case "priority":
                myElement = priority;
                break;
            case "emplooyeFirstName":
                myElement = emplooyeFirstName;
                break;
            case "emplooyeLastName":
                myElement = emplooyeLastName;
                break;
            case "emplooyeId":
                myElement = emplooyeId;
                break;
            case "documentNumber":
                myElement = documentNumber;
                break;
            case "emplooyeCountry":
                myElement = emplooyeCountry;
                break;
        }
        sendKeysFunction(myElement, value);
    }
    public void findAndClick(String strElement){
        switch (strElement){
            case "loginButton":
                myElement=loginButton;
                break;
            case "addButton":
                myElement=addButton;
                break;
            case "saveButton":
                myElement=saveButton;
                break;
            case "closeDialog":
                myElement=closeDialog;
                break;
            case "searchButton":
                myElement=searchButton;
                break;
            case "deleteButton":
                myElement=deleteButton;
                break;
            case "deleteButton1":
                myElement=deleteButton1;
                break;
            case "cookies":
                myElement=cookies;
                break;
            case "entranceBack":
                myElement=entranceBack;
                break;
            case "documentType":
                myElement=documentType;
                break;
            case "personelId":
                myElement=personelId;
                break;
            case "emplooyeContact":
                myElement=emplooyeContact;
                break;
            case "cityOne":
                myElement=cityOne;
                break;
        }
        clickFunction(myElement);
    }public void findAndContainsText(String strElement,String text){
        switch (strElement){
            case "dashBoard":
                myElement=dashBoard;
                break;
            case "createdSuccess":
                myElement=createdSuccess;
                break;
            case "alreadyExist":
                myElement=alreadyExist;
                break;
        }
        verifyContainsText(myElement,text);
    }



    public void searchAndDelete(String searchText){
        findAndSend("searchBox",searchText);
        findAndClick("searchButton");
        GWD.getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
        findAndClick("deleteButton");
        findAndClick("deleteButton1");

    }


    /*
    #  Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName        | AcademicPeriodOption      | GradeLevelOption |
#| Math exam is1   | academicPeriod2              | gradeLevel4  |
#| IT exam is1     | academicPeriod2              | gradeLevel2  |
#| Oracle exam is1 | academicPeriod2              | gradeLevel3  |
#| Math exam  is1  | academicPeriod2              | gradeLevel1  |
     */

    /*
#  Daha önceki Create a Fee, delete Fee Senaryosunu
#  Aşağıdaki 5 farklı değerler için çalıştırınız.
     */

}
