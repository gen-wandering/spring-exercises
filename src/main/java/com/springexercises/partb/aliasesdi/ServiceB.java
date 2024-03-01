package com.springexercises.partb.aliasesdi;

public class ServiceB {
    DatabaseService databaseService;

    public void setDatabaseService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
}
