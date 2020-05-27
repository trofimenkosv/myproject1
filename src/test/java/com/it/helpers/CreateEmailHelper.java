package com.it.helpers;

import com.it.Email.Email;
import com.it.pages.CreateEmailPage;

public class CreateEmailHelper extends CreateEmailPage {

    public void create (String recipient, String subject) {
        setInputRecipient();
        setInputSubject();
        btnClickCreate();
    }
    public void create (Email email) {
        create();

    }
}
