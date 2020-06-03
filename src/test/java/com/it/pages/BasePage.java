package com.it.pages;

//import com.it.driver.DriverFactory;
import com.it.driver.MyDriver;
//import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
   protected static MyDriver driver = MyDriver.getMyDriver();
    protected Logger log = Logger.getLogger(this.getClass().getCanonicalName());

    /*static {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
    }*/

    public BasePage() {
        PageFactory.initElements(driver, this);

    }
}
