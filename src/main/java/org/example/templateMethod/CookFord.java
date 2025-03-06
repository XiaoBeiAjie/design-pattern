package org.example.templateMethod;

public class CookFord extends Cook {
    @Override
    protected void step_A() {
        System.out.println("放入菜品");
    }
    @Override
    protected void step_B() {
        System.out.println("加盐加油");
    }
}
