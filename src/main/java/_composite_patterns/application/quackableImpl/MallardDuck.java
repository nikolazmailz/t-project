package _composite_patterns.application.quackableImpl;

import _composite_patterns.application.Quackable;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack MallardDuck");
    }
}
