package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FormContent extends Parent {


    @FindBy(xpath = "(//div[contains(@class,'mat-select-value')])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//span[contains(@class,'mat-option-text')])[2]")
    private WebElement academicPeriod1;
    @FindBy(xpath = "(//div[contains(@class,'mat-select-value')])[2]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//span[contains(@class,'mat-option-text')])[3]")
    private WebElement gradeLevel1;

    @FindBy(xpath = "(//input[contains(@id,'mat-input')])[1]")
    private WebElement regStart;

    @FindBy(xpath = "(//input[contains(@id,'mat-input')])2]")
    private WebElement regEnd;

    public FormContent() {

        PageFactory.initElements(GWD.getDriver(),this);
    }

    private WebElement myElement;
    public void findAndSend(String strElement,String value){
        switch (strElement){

        }
        sendKeysFunction(myElement, value);
    }
    public void findAndClick(String strElement){
        switch (strElement){
            case "academicPeriod":
                myElement=academicPeriod;
                break;
            case "academicPeriod1":
                myElement=academicPeriod1;
                break;
            case "gradeLevel":
                myElement=gradeLevel;
                break;
            case "gradeLevel1":
                myElement=gradeLevel1;
                break;

            case "regStart":
                myElement=regStart;
                break;
            case "regEnd":
                myElement=regEnd;
                break;

        }
        clickFunction(myElement);
    }



}
