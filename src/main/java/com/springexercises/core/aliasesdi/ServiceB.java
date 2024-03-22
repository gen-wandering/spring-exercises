package com.springexercises.core.aliasesdi;

public class ServiceB {
    DatabaseService databaseService;

    public void setDatabaseService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
}
