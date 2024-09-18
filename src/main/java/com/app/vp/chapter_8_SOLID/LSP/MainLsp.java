package com.app.vp.chapter_8_SOLID.LSP;

public class MainLsp {
    public static void main(String[] args) {

        Shape r = new Rect();
        r.width();
        r.height();

        Shape s = new Squ();
        s.width();
        s.height();

        System.out.println(r);
        System.out.println(s);

    }
}
