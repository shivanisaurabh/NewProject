package org.example.uitility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driver {
private static volatile driver instance;
    private static ThreadLocal<WebDriver> thd=new ThreadLocal();
    private driver(){
        if (instance!=null){
        throw new IllegalArgumentException("Object is already created");
        }
        }

    public void initDriver(String browser){
        switch(browser){
            case "chrome" :{
                thd.set(new ChromeDriver());
                break;
            }
            case "firefox" :{
                thd.set(new FirefoxDriver());
                break;
            }

            case "edge" :{
                thd.set(new InternetExplorerDriver());
                break;
            }

            default:
                throw new IllegalArgumentException("Unsupoorted Browser : " + browser);
        }

        thd.get().manage().window().maximize();

    }
public static driver getInstance(String browser){
if(instance==null){
    synchronized(driver.class){
        if(instance==null){
            instance=new driver();
        }
    }

} if(thd.get()==null){
instance.initDriver(browser);
}

return instance;
}

    public WebDriver getDriver(){
        return thd.get();
    }

public static void quitBrowser(){
   if(thd.get()!=null){
     thd.get().quit();
   }
}

    }



