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


    // login with only one parametric user name
    // password is coming from configuration file
    @When("the user logins with valid {string} and password")
    public void the_user_logins_with_valid_and_password(String usernameStr) {

        String username = ConfigurationReader.get(usernameStr.trim());
        String password = ConfigurationReader.get("password");

        BrowserUtils.waitFor(1);

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user logged as {string}")
    public void the_user_logged_as(String usernameStr) {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        String username = ConfigurationReader.get(usernameStr.trim());
        String password = ConfigurationReader.get("password");

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

    // non-authorized users should not log in
    @When("the user logs in with invalid {string} and {string}")
    public void the_user_logs_in_with_invalid_and(String invalidUsername, String invalidPassword) {

        BrowserUtils.waitFor(2);

        String username = ConfigurationReader.get(invalidUsername);
        String password = ConfigurationReader.get(invalidPassword);

        LoginPage loginPage = new LoginPage();
        loginPage.login(invalidUsername, invalidPassword);
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
