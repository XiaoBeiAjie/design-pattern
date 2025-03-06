package org.example.templateMethod;

public class CookRBQ extends Cook {
    @Override
    public void step_A() {
        System.out.println("放烤串");
    }
    @Override
    public void step_B() {
        System.out.println("加孜然");
    }
}
