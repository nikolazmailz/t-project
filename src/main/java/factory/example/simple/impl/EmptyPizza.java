package factory.example.simple.impl;

import factory.example.simple.MyObject;

public class EmptyPizza implements MyObject {
    @Override
    public void prepare() {
        System.out.println("EmptyPizza");
    }

    @Override
    public void bake() {
        System.out.println("EmptyPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("EmptyPizza cut");
    }

    @Override
    public void box() {
        System.out.println("EmptyPizza box");
    }
}
