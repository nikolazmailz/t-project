package _composite_patterns.application.quackableImpl;

import _composite_patterns.application.Quackable;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack RubberDuck");
    }
}
