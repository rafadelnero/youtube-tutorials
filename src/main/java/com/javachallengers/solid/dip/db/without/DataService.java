package com.javachallengers.solid.dip.db.without;

// High-level module
public class DataService {
    private SqlDatabase database;

    public DataService() {
        this.database = new SqlDatabase();
    }

    public void processData(String data) {
        database.saveData(data);
    }
}