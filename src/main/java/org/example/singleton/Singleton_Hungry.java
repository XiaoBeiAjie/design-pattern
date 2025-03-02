package org.example.singleton;

// 饿汉模式
public class Singleton_Hungry {
    private static final Singleton_Hungry instance = new Singleton_Hungry();
    private Singleton_Hungry() {}
    public static Singleton_Hungry getInStance() {
        return instance;
    }
}