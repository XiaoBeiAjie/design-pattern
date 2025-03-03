package org.example.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        new SecondRobot().doSomething();
        System.out.println("-----------");
        new DecoratorRobot(new FirstRobot()).doMoreThing();
    }
}
