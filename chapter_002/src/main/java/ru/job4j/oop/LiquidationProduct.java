package ru.job4j.oop;

public final class LiquidationProduct {
    private Product product;

    public LiquidationProduct(String name, int price) {

        product = new Product(name, price);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

/*    public String label() {
        return product.label();
    }*/
}

/*
package ru.job4j.oop;

public class LiquidationProduct extends Product {
    public LiquidationProduct(String name, int price) {
        super(name, price);
    }

    @Override
    public int discount() {
        return 90;
    }
}*/

/*package ru.job4j.oop;

public class LiquidationProduct extends Product {
    private String name;

    public LiquidationProduct(String name, int price) {
        super(name, price);
        this.name = name;
    }

    @Override
    public int discount() {
        return 90;
    }

    @Override
    public String label() {
        return name + " " + price();
    }
}*/