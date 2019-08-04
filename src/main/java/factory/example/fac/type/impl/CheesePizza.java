package factory.example.fac.type.impl;

import factory.example.fac.type.MyObject;

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
