package org.example.actions;

import org.example.uitility.readProp;
import org.openqa.selenium.WebDriver;

public class common {

    public void clickOnButton(String browser){
        homePage homepage=new homePage(browser);
        homepage.button.click();
    }
}
