package strategy.example.Behavior.impl;

import strategy.example.Behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Don't fly");
    }
}
