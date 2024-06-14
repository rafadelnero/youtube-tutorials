package com.javachallengers.solid.liskov.door.without;

public class TimedDoorLock extends DoorLock {
    private int timer;  // Timer in seconds

    public TimedDoorLock(int timer) {
        super();
        this.timer = timer;
    }

    @Override
    public void unlock() {
        super.unlock();
        try {
            Thread.sleep(timer * 1000);  // Simulate waiting time.
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        lock();  // Automatically lock the door after the timer.
        System.out.println("Door has been relocked automatically.");
    }
}