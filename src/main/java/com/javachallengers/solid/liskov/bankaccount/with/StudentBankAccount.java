package com.javachallengers.solid.liskov.bankaccount.with;

class StudentBankAccount extends BankAccount {
    
    public StudentBankAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        // Does not add any new preconditions
    }
}