package com.javachallengers.solid.dip.db.with;

public class Main {
    public static void main(String[] args) {
        Database sqlDatabase = new SqlDatabase();
        Database fileDatabase = new FileDatabase();
        DataService dataService = new DataService(sqlDatabase);
        dataService.processData("Example data");
    }
}