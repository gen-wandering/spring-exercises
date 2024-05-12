package com.springexercises.core.beanconfig;

public class Phone {
    private final MessageService messageService;

    public Phone(MessageService messageService) {
        this.messageService = messageService;
    }

    public MessageService getMessageService() {
        return messageService;
    }
}
