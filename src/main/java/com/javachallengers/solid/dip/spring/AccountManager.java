package com.javachallengers.solid.dip.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountManager {

    private final AccountService accountService;

    @Autowired
    public AccountManager(AccountService accountService) {
        this.accountService = accountService;
    }

    public void manage(String accountId) {
        accountService.manageAccount(accountId);
    }
}