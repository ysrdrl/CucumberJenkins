package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.DBUtility;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _06_JDBCMatch extends Parent {
    DialogContent dc = new DialogContent();

    @Then("Send the query database {string} and control match")
    public void sendTheQueryDatabaseAndControlMatch(String query) {
        waitUntilVisibleAll(dc.names);
        ArrayList<ArrayList<String>> list = DBUtility.getDataList(query);
        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i).get(1) + "VE" + dc.names.get(i - 1).getText());
            Assert.assertEquals(list.get(i).get(1), dc.names.get(i - 1).getText());

        }
    }


}
