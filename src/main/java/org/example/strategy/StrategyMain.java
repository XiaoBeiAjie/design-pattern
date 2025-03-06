package org.example.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy_a = new Strategy_A();
        Strategy strategy_b = new Strategy_B();
        context.setStrategy(strategy_a);
        context.run();
        context.setStrategy(strategy_b);
        context.run();
    }
}
