package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class _05_ApachePOISteps {

    DialogContent dc = new DialogContent();

    @When("User Create citizenShip with ApachePOI")
    public void userCreateCitizenShipWithApachePOI() {
        String path = "src/test/java/ApachePOI/Resource/ApacheExcel2.xlsx";
        ArrayList<ArrayList<String>> list = ExcelUtility.getListData(path, "testCitizen", 2);


        for (int i = 0; i < list.size(); i++) {
            System.out.println("ekleme"+list);
            dc.findAndClick("addButton");
            dc.findAndSend("nameInput", list.get(i).get(0));
            dc.findAndSend("shortName", list.get(i).get(1));
            dc.findAndClick("saveButton");
            dc.findAndContainsText("createdSuccess", "success");
            //GWD.Bekle(1);
        }

    }

    @Then("User Delete citizenShip with ApachePOI")
    public void userDeleteCitizenShipWithApachePOI() {

        String path = "src/test/java/ApachePOI/Resource/ApacheExcel2.xlsx";
        ArrayList<ArrayList<String>> list = ExcelUtility.getListData(path, "testCitizen", 2);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

            dc.searchAndDelete(list.get(i).get(0));
            dc.findAndContainsText("createdSuccess", "success");

        }


    }
}
