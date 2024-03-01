package com.springexercises.partb.aliasesdi;

public class ServiceA {
    private DatabaseService databaseService;

    public void setDatabaseService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
}
