package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement ldUserEmail;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    public String getLbUserEmail() {
        return ldUserEmail.getText();
    }

    /*String mail = driver.findElement(By.xpath("//span[@class='sn_menu_title']")).getText();*/
}
