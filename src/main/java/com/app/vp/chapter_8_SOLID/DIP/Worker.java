package com.app.vp.chapter_8_SOLID.DIP;

public class Worker implements IWorker{

    @Override
    public void work() {
        System.out.println("Worker-work");
    }
}
