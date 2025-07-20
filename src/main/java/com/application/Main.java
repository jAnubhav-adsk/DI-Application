package com.application;

import com.application.communication.controllers.CommController;
import com.application.communication.controllers.implementation.EmailController;
import com.application.communication.controllers.implementation.SMSController;

import com.application.communication.modules.CommModule;

import com.application.communication.services.implementation.EmailService;
import com.application.communication.services.implementation.SMSService;

import com.google.inject.Guice;
import com.google.inject.Injector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new CommModule());
        CommController commController = null;

        commController = injector.getInstance(EmailController.class);
        commController.setCommService(injector.getInstance(EmailService.class));
        commController.useService("jainanubhav2003@gmail.com", "Hello World");

        commController = injector.getInstance(SMSController.class);
        commController.setCommService(injector.getInstance(SMSService.class));
        commController.useService("1234567890", "Hello World");
    }
}