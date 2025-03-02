package org.example.factory;

public class FactoryMain {
    public static void main(String[] args) {
        AbstractFactory factory_A = new Factory_A();
        AbstractFactory factory_B = new Factory_B();
        Phone phone = factory_A.createPhone();
        phone.print();
        phone = factory_B.createPhone();
        phone.print();
        Mask mask = factory_A.createMask();
        mask.print();
        mask = factory_B.createMask();
        mask.print();
    }
}
