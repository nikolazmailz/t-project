package strategy.example.Behavior.impl;

import strategy.example.Behavior.FlyBehavior;
import strategy.example.Behavior.QuackBehavior;

public class QuackRubberDuck implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack rubber duck");
    }
}
