package com.it.email;

import java.util.ResourceBundle;

public class EmailFactory {
    private static ResourceBundle email = ResourceBundle.getBundle("email");


    public static Email getValidEmail() {
        return new Email(email.getString("email"),
                email.getString("email"),
                email.getString("subject"),
                email.getString("body"));

    }
}
