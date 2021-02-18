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

   // this method is especially to be used for the other test cases after login
    @When("the user logged as {string}")
    public void the_user_logged_as(String usernameStr) {


        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        String password = ConfigurationReader.get("password");
        String username = ConfigurationReader.get(usernameStr);

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    // the page title is compared to see if the user is logged in
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        BrowserUtils.waitFor(1);

       Assert.assertTrue("verify that user in Portal page",
                Driver.get().getTitle().contains("Portal"));
    }



    @When("the user logs in with {string} and {string}")
    public void the_user_logs_in_with_and(String username, String password) {
        BrowserUtils.waitFor(2);

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }



    // error messages for nonauthorized users
    @Then("Login error message should be displayed")
    public void login_error_message_should_be_displayed() {

        LoginPage loginPage = new LoginPage();

        Assert.assertEquals("verify that invalid credentials",
                loginPage.getLoginErrorMessage(),
                "Incorrect login or password");
    }

}
