package com.application.communication.modules;

import com.application.communication.services.implementation.EmailService;
import com.application.communication.services.implementation.SMSService;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class CommModule extends AbstractModule {
    @Override
    public void configure() {
        bind(EmailService.class).in(Scopes.SINGLETON);
        bind(SMSService.class).in(Scopes.SINGLETON);
    }
}
