package com.javachallengers.solid.dip.setterdi;

public class Main {
    public static void main(String[] args) {
        AccountService userAccountService = new UserAccountService();
        AccountService adminAccountService = new AdminAccountService();
        
        AccountManager accountManager = new AccountManager();
        
        accountManager.setAccountService(userAccountService);
        accountManager.manage("user123");

        accountManager.setAccountService(adminAccountService);
        accountManager.manage("admin456");
    }
}