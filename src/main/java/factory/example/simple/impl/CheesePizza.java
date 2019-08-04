package factory.example.simple.impl;

import factory.example.simple.MyObject;

public class CheesePizza implements MyObject {
    @Override
    public void prepare() {
        System.out.println("CheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza box");
    }
}
