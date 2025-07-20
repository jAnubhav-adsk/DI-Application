package com.application.communication.controllers.implementation;

import com.application.communication.controllers.CommController;
import com.application.communication.services.implementation.EmailService;

import com.google.inject.Inject;

public class EmailController extends CommController {
    @Override
    public void useService(String recipient, String msg) {
        System.out.println("Email Service is Configured.");
        getCommService().sendMessage(recipient, msg);
    }
}
