package strategy.example.Behavior.impl;

import strategy.example.Behavior.QuackBehavior;

public class QuackDuck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack duck!");
    }
}
