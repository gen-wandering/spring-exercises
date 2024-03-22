package com.springexercises.core.model;

public class MockDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to mock database...");
    }
}