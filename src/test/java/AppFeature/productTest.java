package AppFeature;

import org.example.actions.productPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class productTest extends Login {
    private productPage productpage;  // ✅ Declare once

    @BeforeClass(alwaysRun = true)
    public void prodt (@Optional("chrome") String browser) {
        productpage = new productPage(browser);  // ✅ Initialize only once

    }
    @Test
    public void getAllLink (){
        System.out.println("debug");
        String links=productpage.printAllLinks();
        System.out.println(links);
    }
}
