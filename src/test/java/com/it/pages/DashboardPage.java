package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement ldUserEmail;

    @FindBy(xpath = "(//div//p/a)[1]")
    private WebElement btnCreateEmail;


   /* public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
*/
    public String getLbUserEmail() {
        return ldUserEmail.getText();
    }

    public void btnClickCreateEmail() {
        btnCreateEmail.click();
    }


    /*String mail = driver.findElement(By.xpath("//span[@class='sn_menu_title']")).getText();*/
}
