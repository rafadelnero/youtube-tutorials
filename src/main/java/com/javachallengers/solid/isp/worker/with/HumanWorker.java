package com.javachallengers.solid.isp.worker.with;

class HumanWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Human is working");
    }

    public void eat() {
        System.out.println("Human is eating");
    }
}