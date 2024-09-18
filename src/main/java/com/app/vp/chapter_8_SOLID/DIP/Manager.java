package com.app.vp.chapter_8_SOLID.DIP;

public class Manager {

    IWorker worker;

    public void setIWorker(IWorker w){
        worker = w;
    }

    public void manage(){
        worker.work();
    }

}
