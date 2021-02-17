package com.bleucrm.step_definitions;

import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginPageStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }


    @When("the user logins with valid {string} and password")
    public void the_user_logins_with_valid_and_password(String usernameStr) {
        String username = ConfigurationReader.get(usernameStr.trim());
        String password = ConfigurationReader.get("password");

        BrowserUtils.waitFor(3);
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String expectedTitle = "Portal";
        BrowserUtils.waitFor(1);
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue("verify that user in Portal page",
                actualTitle.contains(expectedTitle));
        System.out.println("Succesfully in Portal Page");

        System.out.println(Driver.get().getTitle());

    }

}
