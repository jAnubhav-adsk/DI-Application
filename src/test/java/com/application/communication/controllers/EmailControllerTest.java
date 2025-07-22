package com.application.communication.controllers;

import com.application.communication.controllers.implementation.EmailController;
import com.application.communication.services.implementation.EmailService;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EmailControllerTest {
    private EmailService emailService;
    private EmailController emailController;

    @BeforeEach
    public void setup() {
        emailService = Mockito.mock(EmailService.class);

        Mockito.doNothing().when(emailService).sendMessage(Mockito.anyString(), Mockito.anyString());
        emailController = new EmailController(); emailController.setCommService(emailService);
    }

    @Test
    public void useServiceTest() {
        emailController.useService(Mockito.anyString(), Mockito.anyString());
        Mockito.verify(emailService).sendMessage(Mockito.anyString(), Mockito.anyString());
    }

    @AfterEach
    public void tearDown() {
        Mockito.verifyNoMoreInteractions(emailService);
        emailService = null; emailController = null;
    }
}
