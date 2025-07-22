package com.application.communication.services.implementation;

import com.application.communication.services.CommService;
import com.application.logger.annotations.Loggable;

public class EmailService extends CommService {

    @Override @Loggable
    public void sendMessage(String recipient, String msg) {
        System.out.println("Email to: " + recipient + " Msg: " + msg);
    }
}
