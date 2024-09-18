package com.app.vp.chapter_8_SOLID.other_principles.strive_low_cohesion;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.doSomething(); // Это приведет к уведомлению наблюдателей


    }
}
