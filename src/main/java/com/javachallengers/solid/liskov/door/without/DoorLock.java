package com.javachallengers.solid.liskov.door.without;

public class DoorLock {
    private boolean isLocked;

    public DoorLock() {
        this.isLocked = true;  // Doors start locked for security.
    }

    public void unlock() {
        isLocked = false;
        System.out.println("Door is unlocked.");
        // Postcondition: The door must be unlocked.
    }

    public void lock() {
        isLocked = true;
        System.out.println("Door is locked.");
        // Postcondition: The door must be locked.
    }

    public boolean isLocked() {
        return isLocked;
    }
}