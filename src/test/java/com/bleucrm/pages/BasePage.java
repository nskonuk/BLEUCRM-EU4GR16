package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@class='user-img user-default-avatar']")
    public WebElement profileAvatar;

    @FindBy(css = "#user-name")
    public WebElement userNameWithPopUp;

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logOut;

    public void loggingOut(){
        userNameWithPopUp.click();
        logOut.click();
    }

}
