package org.example.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class productPage extends base {
    @FindAll(@FindBy(tagName = "a"))
    List<WebElement> allLinks;
    String resultLink="";

    public productPage (String browser) {
        super(browser);
    }

    public String printAllLinks(){
        for(WebElement  link:allLinks){
            resultLink=link.getAttribute("href");
           System.out.println(link.getAttribute("href"));

        }
        return resultLink;
    }

    public void close(){
        driverManager.quit();
    }
}
