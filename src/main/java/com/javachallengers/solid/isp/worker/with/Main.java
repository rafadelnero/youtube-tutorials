package com.javachallengers.solid.isp.worker.with;

public class Main {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
        work(humanWorker);

        Workable robotWorker = new RobotWorker();
        work(robotWorker);

        Eatable humanEater = new HumanWorker();
        humanEater.eat();
        // robotWorker does not have an eat() method because it doesn't need one
    }

    public static void work(Workable workable) {
        workable.work();
    }
}