package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.CreateEmailHelper;
import com.it.helpers.DashboardHelper;
import com.it.helpers.LoginHelper;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CreateEmailHelper emailHelper;

    public App() {
        common = new CommonHelper();
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        emailHelper = new CreateEmailHelper();
    }
}
