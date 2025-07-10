package org.example.actions;


import org.example.uitility.driver;
import org.example.uitility.readProp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homePage extends base{


    @FindBy(id="user-name") WebElement username;
    @FindBy(id="password") WebElement password;
    @FindBy(id="login-button") WebElement button;

    public homePage(String browser) {
        super(browser);
    }


    public void loginPageUrl(){
        driverManager.get(readProp.get("base.url"));
    }

    public String getTitle(){
        String pageTitle=driverManager.getTitle();
        return pageTitle;
    }

    public void close(){
       driverManager.quit();
    }
    public void logintosite(String name,String pass){
        username.sendKeys(name);
        password.sendKeys(pass);
        button.click();

    }




}
