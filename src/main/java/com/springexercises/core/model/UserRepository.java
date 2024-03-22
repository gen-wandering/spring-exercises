package com.springexercises.core.model;

import com.springexercises.core.customdicontainer.AddDependency;

public class UserRepository {
    private Database db;

    @AddDependency
    public UserRepository(Database db) {
        this.db = db;
    }

    public Database getDb() {
        return db;
    }

    // Other methods for UserRepository
    public void performDatabaseOperation() {
        db.connect();
    }
}