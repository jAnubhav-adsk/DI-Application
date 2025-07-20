package com.application.communication.modules;

import com.application.communication.controllers.implementation.EmailController;
import com.application.communication.controllers.implementation.SMSController;

import com.application.communication.services.implementation.EmailService;
import com.application.communication.services.implementation.SMSService;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class CommModule extends AbstractModule {
    @Override
    public void configure() {
        bind(EmailController.class).in(Scopes.SINGLETON);
        bind(SMSController.class).in(Scopes.SINGLETON);

        bind(EmailService.class).in(Scopes.SINGLETON);
        bind(SMSService.class).in(Scopes.SINGLETON);
    }
}
