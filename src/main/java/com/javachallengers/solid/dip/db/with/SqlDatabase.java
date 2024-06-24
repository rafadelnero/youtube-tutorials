package com.javachallengers.solid.dip.db.with;

// Low-level module
public class SqlDatabase implements Database {
    public void saveData(String data) {
        // Code to save data to SQL database
        System.out.println("Data saved to SQL database.");
    }
}