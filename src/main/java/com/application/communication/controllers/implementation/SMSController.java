package com.application.communication.controllers.implementation;

import com.application.communication.controllers.CommController;

public class SMSController extends CommController {

    @Override
    public void useService(String recipient, String msg) {
        System.out.println("Configured SMS Controller.");
        getCommService().sendMessage(recipient, msg);
    }
}
