package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmailPage extends BasePage {

	@FindBy(id = "to")
	private WebElement inputRecipient;

	@FindBy(name = "subject")
	private WebElement inputSubject;

	@FindBy(id = "text")
	private WebElement inputBody;

	@FindBy(xpath = "(//input[@name='send'])[1]")
	private WebElement btnCreate;

    protected void setInputRecipient(String recipient) {
        inputRecipient.sendKeys(recipient);
    }

    protected void setInputSubject(String subject) {
        inputSubject.sendKeys(subject);
    }

	protected void setInputBody(String body) { inputBody.sendKeys(body); }

    protected void btnClickCreate() { btnCreate.click(); }

}


