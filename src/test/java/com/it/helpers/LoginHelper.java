package com.it.helpers;

import com.it.pages.LoginPage;
import com.it.users.User;

public class LoginHelper extends LoginPage {

    public void login (String login, String password) {
        setInputLogin(login);
        setInputPassword(password);
        btnClickLogin();

    }
    public void login (User user) {
        driver.scrollDown();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.scrollUp();
        login (user.userName, user.password);

    }

}
