package com.it.pages;

import com.it.common.Constans;
import com.it.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import static com.it.common.Constans.BASE_URL;

public class BasePage {
   protected static WebDriver driver = DriverFactory.getDriver();

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
