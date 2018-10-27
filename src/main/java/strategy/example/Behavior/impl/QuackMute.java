package strategy.example.Behavior.impl;

import strategy.example.Behavior.QuackBehavior;

public class QuackMute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute quack");
    }
}
