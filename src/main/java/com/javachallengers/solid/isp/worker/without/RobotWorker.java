package com.javachallengers.solid.isp.worker.without;

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot is working");
    }

    public void eat() {
        // Not applicable
    }
}