package com.bleucrm.step_definitions;

import com.bleucrm.pages.BasePage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs  extends BasePage {


    @When("clicks log out option from popUp menu under his or her name")
    public void clicks_log_out_option_from_dropdown_menu_under_his_or_her_name() {
          loggingOut();
    }
    @Then("the page title should be Authorization")
    public void the_page_title_should_be_Authorization() {
        String actual= Driver.get().getTitle();

        Assert.assertEquals(actual,"Authorization");

    }
    @When("user clicks his or her profile avatar")
    public void user_clicks_his_or_her_profile_avatar() {
       profileAvatar.click();
        BrowserUtils.waitForVisibility(logOut,3);
    }

}
