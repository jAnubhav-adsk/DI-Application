package com.application.communication.services.implementation;

import com.application.communication.services.CommService;

public class EmailService extends CommService {
    @Override
    public void sendMessage(String recipient, String msg) {
        System.out.println("Email to: " + recipient + " Msg: " + msg);
    }
}
