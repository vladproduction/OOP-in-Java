package com.app.vp.chapter_8_SOLID.DIP;

public class MainDip {
    public static void main(String[] args) {

        Manager manager = new Manager();
        IWorker worker = new Worker();
        IWorker superWorker = new SuperWorker();

        manager.setIWorker(worker);
        manager.manage();
        System.out.println("==========");
        manager.setIWorker(superWorker);
        manager.manage();

    }
}
