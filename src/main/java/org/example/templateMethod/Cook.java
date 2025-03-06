package org.example.templateMethod;

public abstract class Cook {
    protected abstract void step_A();
    protected abstract void step_B();
    public void cook() {
        System.out.println("开始做饭");
        step_A();
        step_B();
        System.out.println("结束做饭");
    }
}


