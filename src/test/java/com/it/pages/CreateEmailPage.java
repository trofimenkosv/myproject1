package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmailPage {

	@FindBy(name = "recipient")
	private WebElement inputRecipient;

	@FindBy(name = "subject")
	private WebElement inputSubject;

	@FindBy(xpath = "")
	private WebElement btnCreate;

    protected void setInputRecipient(String recipient) {
        inputRecipient.sendKeys(recipient);
    }

    protected void btnClickCreate() {
        btnCreate.click();
    }
    protected void setInputSubject(String login) {
        inputRecipient.sendKeys(login);
    }

}
