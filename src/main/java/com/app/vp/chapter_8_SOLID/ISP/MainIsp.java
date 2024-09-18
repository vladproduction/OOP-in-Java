package com.app.vp.chapter_8_SOLID.ISP;


/**
 * Interface Segregation Principle (ISP) is one of the SOLID principles of object-oriented design.
 * It states that no client should be forced to depend on methods it does not use.
 * This means that interfaces should be specific to individual clients instead of general-purpose.
 * */
public class MainIsp {
    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.setWorker(new HumanWorker());
        manager.setEater(new HumanWorker());
        manager.manageHuman();

        manager.setWorker(new RobotWorker());
        manager.setRecharge(new RobotWorker());
        manager.manageRobot();


    }
}
