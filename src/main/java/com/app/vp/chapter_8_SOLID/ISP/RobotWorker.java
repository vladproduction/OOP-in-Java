package com.app.vp.chapter_8_SOLID.ISP;

public class RobotWorker implements Workable, Rechargeable {

    @Override
    public void recharge() {
        System.out.println("RobotWorker: recharge");
    }

    @Override
    public void work() {
        System.out.println("RobotWorker: work");
    }
}
