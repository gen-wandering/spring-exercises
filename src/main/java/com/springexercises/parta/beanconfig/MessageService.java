package com.springexercises.parta.beanconfig;

public class MessageService {
    private String message = "Message from MessageService";

    public MessageService() {
    }

    public MessageService(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
