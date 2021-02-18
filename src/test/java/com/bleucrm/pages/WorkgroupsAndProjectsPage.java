package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.By;

public class WorkgroupsAndProjectsPage extends BasePage{


    public void joinGroup(String groupName) throws InterruptedException {
        Driver.get().findElement(By.xpath("//span[@class='sonet-groups-group-title-text']//a[.='"+ groupName +"']/../../..//span[.='Join']")).click();
        Thread.sleep(2000);
    }
}
