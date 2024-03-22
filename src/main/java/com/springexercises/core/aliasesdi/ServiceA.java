package com.springexercises.core.aliasesdi;

public class ServiceA {
    private DatabaseService databaseService;

    public void setDatabaseService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
}
