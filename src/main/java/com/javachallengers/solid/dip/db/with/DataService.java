package com.javachallengers.solid.dip.db.with;

// High-level module
public class DataService {
    private Database database;

    // Constructor Injection
    public DataService(Database database) {
        this.database = database;
    }

    public void processData(String data) {
        database.saveData(data);
    }
}