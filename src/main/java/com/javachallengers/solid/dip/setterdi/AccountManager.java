package com.javachallengers.solid.dip.setterdi;

public class AccountManager {
    private AccountService accountService;

    // Setter Injection
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void manage(String accountId) {
        if (accountService != null) {
            accountService.manageAccount(accountId);
        } else {
            System.out.println("AccountService not set.");
        }
    }
}