package com.application.communication.services.implementation;

import com.application.communication.services.CommService;

public class SMSService extends CommService {
    @Override
    public void sendMessage(String recipient, String msg) {
        System.out.println("SMS to: " + recipient + " Msg: " + msg);
    }
}
