package com.application.communication.services;

import com.application.communication.services.implementation.SMSService;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class SMSServiceTest {
    private SMSService smsService;

    @BeforeEach
    public void setUp() { smsService = new SMSService(); }

    @Test
    public void sendMessageTest() {
        smsService.sendMessage("Test Number", "Test Message");
    }

    @AfterEach
    public void tearDown() { smsService = null; }
}
