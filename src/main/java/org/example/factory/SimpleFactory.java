package org.example.factory;

public class SimpleFactory {
    public static Product createProduct(String type) {
        if (type.equals("A")) return new Product_A();
        else if (type.equals("B")) return new Product_B();
        return null;
    }

    public static void main(String[] args) {
        Product product = createProduct("A");
        if (product != null) {
            product.print();
        }
        product = createProduct("B");
        if (product != null) {
            product.print();
        }
    }
}

abstract class Product{
    void print() {}
}

class Product_A extends Product{
    @Override
    void print() {
        System.out.println("Product A");
    }
}

class Product_B extends Product{
    @Override
    void print() {
        System.out.println("Product B");
    }
}