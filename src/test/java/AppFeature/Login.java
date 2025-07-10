package AppFeature;

import org.example.actions.base;
import org.example.actions.common;
import org.example.actions.homePage;
import org.example.uitility.driver;
import org.example.uitility.readProp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class Login  {
    WebDriver driverManager ;

    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
public void login (@Optional("chrome") String browser){
    homePage homepage=new homePage(browser);
    String user = readProp.get("username.standard");
    String pass = readProp.get("password");
    homepage.loginPageUrl();
    homepage.logintosite(user,pass);
    String titleValue=homepage.getTitle();
    System.out.println(titleValue);

}

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quitBrowser();
    }
}
