package com.application.logger.modules;

import com.application.logger.annotations.Loggable;
import com.application.logger.interceptors.LoggingInterceptor;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class LoggerModule extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(
                Matchers.any(), Matchers.annotatedWith(Loggable.class),
                new LoggingInterceptor()
        );
    }
}
