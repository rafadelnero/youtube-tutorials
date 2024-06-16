package com.javachallengers.solid.isp.worker.without;

public class Main {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        Worker robot = new RobotWorker();

        human.work();
        human.eat();

        robot.work();
        robot.eat(); // does nothing meaningful
    }
}