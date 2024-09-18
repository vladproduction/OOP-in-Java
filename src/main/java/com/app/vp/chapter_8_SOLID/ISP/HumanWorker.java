package com.app.vp.chapter_8_SOLID.ISP;

public class HumanWorker implements Workable, Eatable{

    @Override
    public void eat() {
        System.out.println("HumanWorker: eat");
    }

    @Override
    public void work() {
        System.out.println("HumanWorker: work");
    }
}
