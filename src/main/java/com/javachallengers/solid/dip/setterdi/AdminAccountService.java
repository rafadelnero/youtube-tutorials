package com.javachallengers.solid.dip.setterdi;

public class AdminAccountService implements AccountService {
    @Override
    public void manageAccount(String accountId) {
        System.out.println("Managing admin account with ID: " + accountId);
    }
}