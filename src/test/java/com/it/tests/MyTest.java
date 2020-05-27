package com.it.tests;

import com.it.helpers.CommonHelper;
import com.it.pages.BasePage;
import com.it.pages.DashboardPage;
import com.it.users.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test1() {
        System.out.println(UserFactory.getRandomUsers(10));

        /*System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.i.ua/");*/

//        LoginHelper login = new LoginHelper();
        app.login.login(validUser);

        /*DashboardPage dashboardPage = new DashboardPage();
        String email = dashboardPage.getLbUserEmail();*/


        /*loginPage.setInputLogin("test1331");
        loginPage.setInputPassword("qwerty123@");
        loginPage.btnClickLogin();*/

        /*driver.findElement(By.name("login")).sendKeys("test1331");
        driver.findElement(By.name("pass")).sendKeys("qwerty123@");
        driver.findElement(By.xpath("//input[@tabindex='5']")).click();
        String mail = driver.findElement(By.xpath("//span[@class='sn_menu_title']")).getText();*/

        Assert.assertEquals(app.dashboard.getLbUserEmail(), validUser.email);
        /*CommonHelper helper = new CommonHelper();
        helper.appStop();*/

//        System.out.println();

//        driver.quit();

    }
}
