package com.application.communication.controllers;

import com.application.communication.controllers.implementation.SMSController;
import com.application.communication.services.implementation.SMSService;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SMSControllerTest {
    private SMSService smsService;
    private SMSController smsController;

    @BeforeEach
    public void setUp() {
        smsService = Mockito.mock(SMSService.class);

        Mockito.doNothing().when(smsService).sendMessage(Mockito.anyString(), Mockito.anyString());
        smsController = new SMSController(); smsController.setCommService(smsService);
    }

    @Test
    public void useServiceTest() {
        smsController.useService(Mockito.anyString(), Mockito.anyString());
        Mockito.verify(smsService).sendMessage(Mockito.anyString(), Mockito.anyString());
    }

    @AfterEach
    public void tearDown() {
        Mockito.verifyNoMoreInteractions(smsService);
        smsService = null; smsController = null;
    }
}
