package com.application.communication.controllers.implementation;

import com.application.communication.controllers.CommController;

public class EmailController extends CommController {

    @Override
    public void useService(String recipient, String msg) {
        System.out.println("Email Service is Configured.");
        getCommService().sendMessage(recipient, msg);
    }
}
