package com.javachallengers.solid.dip.db.with;

public class Main {
    public static void main(String[] args) {
        Database database = new SqlDatabase(); // Or new FileDatabase();
        DataService dataService = new DataService(database);
        dataService.processData("Example data");
    }
}