package com.javachallengers.solid.dip.db.with;

// Another low-level module
public class FileDatabase implements Database {
    public void saveData(String data) {
        // Code to save data to a file
        System.out.println("Data saved to file.");
    }
}