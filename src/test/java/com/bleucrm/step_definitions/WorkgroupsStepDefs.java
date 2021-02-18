package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.BasePage;
import com.bleucrm.pages.WorkgroupsAndProjectsPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WorkgroupsStepDefs {

    @Given("the user navigates to {string} module")
    public void the_user_navigates_to_module(String moduleName) throws InterruptedException {
        new ActivityStreamPage().navigatetoModule(moduleName);
    }

    @When("user finds {string} group and clicks join")
    public void user_finds_group_and_clicks_join(String groupName) throws InterruptedException {
        new WorkgroupsAndProjectsPage().joinGroup(groupName);
    }

    @Then("{string} group should have Request has been sent message")
    public void group_should_have_Request_has_been_sent_message(String groupName) {
        WebElement message = Driver.get().findElement(By.xpath("//div[@id='sonet-groups-list-container']//a[.='"+ groupName +"']/../..//..//span[@class='sonet-groups-group-desc-check']"));
        Assert.assertTrue(message.isDisplayed());
    }
}
