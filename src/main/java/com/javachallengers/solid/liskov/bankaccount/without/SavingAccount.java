package com.javachallengers.solid.liskov.bankaccount.without;

class SavingAccount extends BankAccount {

    private static final double MIN_BALANCE = 50.0;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
        // Precondition is not consistent with superclass
        if (initialBalance < MIN_BALANCE) {
            throw new IllegalArgumentException("Initial balance must be at least $50 for Saving Account");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            throw new IllegalArgumentException("Withdrawal would result in balance dropping below $50");
        }
        super.withdraw(amount);
    }
}
