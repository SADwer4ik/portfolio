package com.game.server.exception;

import java.util.Date;

public class BadCredentialError {
    private int status;
    private String message;
    private Date date;
    public BadCredentialError(int status, String message){
        date = new Date();
        this.status = status;
        this.message = message;
    }
}
