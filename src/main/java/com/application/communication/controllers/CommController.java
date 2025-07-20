package com.application.communication.controllers;

import com.application.communication.services.CommService;
import com.google.inject.Inject;

public abstract class CommController {
    private CommService commService;

    public void setCommService(CommService commService) {
        this.commService = commService;
    }

    public CommService getCommService() {
        return this.commService;
    }

    public abstract void useService(String recipient, String msg);
}