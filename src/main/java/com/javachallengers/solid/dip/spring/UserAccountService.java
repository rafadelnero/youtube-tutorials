package com.javachallengers.solid.dip.spring;

import org.springframework.stereotype.Service;

@Service
public class UserAccountService implements AccountService {
    @Override
    public void manageAccount(String accountId) {
        System.out.println("Managing user account with ID: " + accountId);
    }
}