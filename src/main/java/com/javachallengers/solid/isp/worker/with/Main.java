package com.javachallengers.solid.isp.worker.with;

public class Main {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
        Eatable humanEater = new HumanWorker();
        Workable robotWorker = new RobotWorker();

        humanWorker.work();
        humanEater.eat();

        robotWorker.work();
        // robotWorker does not have an eat() method because it doesn't need one
    }
}