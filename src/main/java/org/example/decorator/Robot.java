package org.example.decorator;

public interface Robot {
    void doSomething();
}

class FirstRobot implements Robot {
    @Override
    public void doSomething() {
        System.out.println("dance");
        System.out.println("play");
    }
}

class SecondRobot extends FirstRobot implements Robot {
    @Override
    public void doSomething() {
        super.doSomething();
        System.out.println("talk");
        System.out.println("run");
    }
}

class DecoratorRobot implements Robot {
    private final Robot delegate;
    public DecoratorRobot(Robot delegate) {
        this.delegate = delegate;
    }
    @Override
    public void doSomething() {
        delegate.doSomething();
    }
    public void doMoreThing() {
        this.doSomething();
        System.out.println("talk");
        System.out.println("run");
    }
}
