package com.app.vp.chapter_8_SOLID.ISP;

public class Manager {

    Workable worker;
    Eatable eater;
    Rechargeable recharge;

    public void setWorker(Workable w){
        worker = w;
    }

    public void setEater(Eatable e){
        eater = e;
    }

    public void setRecharge(Rechargeable r){
        recharge = r;
    }

    public void manageHuman(){
        worker.work();
        eater.eat();
    }

    public void manageRobot(){
        worker.work();
        recharge.recharge();
    }
}
