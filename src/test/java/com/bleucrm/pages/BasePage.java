package com.bleucrm.pages;

import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    //Method for navigating to modules
   public void navigatetoModule(String moduleName) throws InterruptedException {
        Driver.get().findElement(By.xpath("//ul[@id='left-menu-list']//a[@title='"+ moduleName +"']")).click();
        Thread.sleep(2000);
   }
}
