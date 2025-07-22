package com.application.communication.services;

import com.application.communication.services.implementation.EmailService;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class EmailServiceTest {
    private EmailService emailService;

    @BeforeEach
    public void setUp() { emailService = new EmailService(); }

    @Test
    public void sendMessageTest() {
        emailService.sendMessage("Test Email", "Test Message");
    }

    @AfterEach
    public void tearDown() { emailService = null; }
}
