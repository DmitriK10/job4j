package ru.job4j.tracker;

public class Cyber {

    public static void main(String[] args) {
        B b = new B(1, 2, 3);
    }
}

class A {
    int x;
    int y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class B extends A {
    int z;

    public B(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}