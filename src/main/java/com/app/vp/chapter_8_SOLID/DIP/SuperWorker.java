package com.app.vp.chapter_8_SOLID.DIP;

public class SuperWorker implements IWorker{

    @Override
    public void work() {
        System.out.println("SuperWorker-work");
    }
}
