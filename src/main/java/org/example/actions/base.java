package org.example.actions;

import org.example.uitility.driver;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public  class base {
    protected WebDriver driverManager;
    public base(String browser){
        this.driverManager= driver.getInstance(browser).getDriver();
        PageFactory.initElements(driverManager,this);
    }
}
