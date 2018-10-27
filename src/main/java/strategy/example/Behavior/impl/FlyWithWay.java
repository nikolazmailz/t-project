package strategy.example.Behavior.impl;

import strategy.example.Behavior.FlyBehavior;

public class FlyWithWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can fly!");
    }
}
