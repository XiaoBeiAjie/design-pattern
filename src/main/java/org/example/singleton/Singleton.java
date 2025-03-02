package org.example.singleton;

// 双锁检测懒汉模式
public class Singleton {
    private volatile static Singleton instance;
    private Singleton() {}
    public static Singleton getInStance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) instance = new Singleton();
            }
        }
        return instance;
    }
}
