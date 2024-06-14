package com.javachallengers.solid.liskov.door.with;

public class CodeProtectedDoorLock extends DoorLock {
    private String correctCode;
    private boolean codeRequired = true;

    public CodeProtectedDoorLock(String code) {
        super();
        this.correctCode = code;
    }

    // New method to unlock with a code
    public boolean unlockWithCode(String code) {
        if (this.correctCode.equals(code)) {
            super.unlock();
            return true;
        } else {
            System.out.println("Incorrect code. Door remains locked.");
            return false;
        }
    }

    // Overridden method to provide feedback about code requirement
    @Override
    public void unlock() {
        if (!codeRequired) {
            super.unlock();
        } else {
            System.out.println("Unlocking requires a correct code.");
        }
    }

    public void setCodeRequirement(boolean required) {
        this.codeRequired = required;
    }
}