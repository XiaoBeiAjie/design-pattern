package org.example.strategy;

public class Context {
    private Strategy strategy;
    public void run() {
        if (strategy != null) {
            strategy.execute();
        } else {
            System.out.println("Strategy_Null");
        }
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
