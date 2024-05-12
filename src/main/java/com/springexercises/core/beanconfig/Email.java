package com.springexercises.core.beanconfig;

public class Email {
    private final MessageService messageService;

    public Email(MessageService messageService) {
        this.messageService = messageService;
    }

    public MessageService getMessageService() {
        return messageService;
    }
}
