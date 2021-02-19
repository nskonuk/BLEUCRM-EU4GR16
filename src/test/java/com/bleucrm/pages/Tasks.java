package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tasks extends BasePage {

    @FindBy(id = "tasks_panel_menu_view_all")
    public WebElement allTasks;

    @FindBy(id = "tasks_panel_menu_view_role_responsible")
    public WebElement ongoingTasks;

}
