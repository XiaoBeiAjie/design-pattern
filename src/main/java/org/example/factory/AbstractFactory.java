package org.example.factory;

/**
 * 依然不可避免增加产品类别需要修改
 */
public interface AbstractFactory {
    Phone createPhone();
    Mask createMask();
}

interface Phone {
    void print();
}

interface Mask {
    void print();
}

class Phone_A implements Phone {
    @Override
    public void print() {
        System.out.println("Phone_A");
    }
}

class Phone_B implements Phone {
    @Override
    public void print() {
        System.out.println("Phone_B");
    }
}

class Mask_A implements Mask {
    @Override
    public void print() {
        System.out.println("Mask_A");
    }
}

class Mask_B implements Mask {
    @Override
    public void print() {
        System.out.println("Mask_B");
    }
}

class Factory_A implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new Phone_A();
    }
    @Override
    public Mask createMask() {
        return new Mask_A();
    }
}

class Factory_B implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new Phone_B();
    }
    @Override
    public Mask createMask() {
        return new Mask_B();
    }
}


