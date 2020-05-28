package com.it.helpers;

import com.it.email.Email;
import com.it.pages.CreateEmailPage;

public class CreateEmailHelper extends CreateEmailPage {

    public void create (String recipient, String subject, String body) {
        setInputRecipient(recipient);
        setInputSubject(subject);
        setInputBody(body);
        btnClickCreate();
    }
    public void create (Email email) {
        create(email.emailRecipient, email.subject, email.body);

    }
}
