package com.springexercises.model;

import com.springexercises.customdic.AddDependency;

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