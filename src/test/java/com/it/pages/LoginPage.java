package com.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(name = "login")
	private WebElement inputLogin;

	@FindBy(name = "pass")
	private WebElement inputPassword;

	@FindBy(xpath = "//input[@tabindex='5']")
	private WebElement btnLogin;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	protected void setInputLogin(String login) {
		inputLogin.sendKeys(login);
	}

	protected void setInputPassword(String pass) {
		inputPassword.sendKeys(pass);
	}

	protected void btnClickLogin() {
		btnLogin.click();
	}
}

   /* driver.findElement(By.name("login")).sendKeys("test1331");
        driver.findElement(By.name("pass")).sendKeys("qwerty123@");
        driver.findElement(By.xpath("//input[@tabindex='5']")).click();*/

